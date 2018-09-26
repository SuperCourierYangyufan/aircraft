package Swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class paint extends JPanel {

	BufferedImage img = null;
	
	
	public paint() {
		super();
		try {
			img = ImageIO.read(getClass().getResourceAsStream("text01.jpg"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	protected void paintBorder(Graphics g) {
		// TODO 自动生成的方法存根
		super.paintBorder(g);
	}

	@Override
	protected void paintChildren(Graphics g) {
		// TODO 自动生成的方法存根
		super.paintChildren(g);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		//g.setColor(Color.BLUE);
		//g.drawRect(0, 0, 100, 100);
		//g.fillRect(0, 0, 100, 100);
		//g.fillRoundRect(0, 0, 200, 200, 10, 10);
		//g.fillOval(0, 0, 200, 200);
		g.setClip(0, 0, 150, 150);
		g.drawImage(img, 0, 0,200,200, null);
		
	}
	
}
