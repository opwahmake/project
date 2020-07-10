import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class test {
	public static void main(String[] args) {
		JFrame f=new JFrame("test");
		f.setBackground(Color.WHITE);
		ImageIcon ic  = new ImageIcon("C:\\hyunho\\»ç¶÷.PNG");
		JButton ic2 = new JButton(ic);
		ic2.setForeground(Color.WHITE);
		ic2.setBackground(Color.WHITE);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(ic2);
		ic2.setBounds(175, 81, 95, 61);
		f.setVisible(true);
	}

}
