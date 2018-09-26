package Swing;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class JTable extends JFrame {

	private JPanel contentPane;
	//private javax.swing.JTable table;
	Vector columName,rowDate;
	javax.swing.JTable table1 = null;
	JScrollPane jsp = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable frame = new JTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		columName = new Vector();
		columName.add("name");
		columName.add("age");
		columName.add("sex");
		columName.add("money");
		columName.add("contion");
		rowDate = new Vector();
		Vector  hang = new Vector();
		hang.add("joy");
		hang.add("22");
		hang.add("ÄÐ");
		hang.add("8000");
		hang.add("Îäºº");
		rowDate.add(hang);
		table1 = new javax.swing.JTable(rowDate, columName);
		jsp = new JScrollPane(table1);
		this.add(jsp);
		
		
		
		
		
	}
}
