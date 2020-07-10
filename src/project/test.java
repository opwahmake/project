package project;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class test {
public static void main(String[] args) {
	Frame F = new Frame("a");
//	ImageIcon Btn1 = new ImageIcon("C:\\hyunho\\사람.PNG");
	JButton btn= new JButton("버튼");
//	btn.setText("cvzvzxc");
	F.setSize(300,300);
	F.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	F.add(btn);
	F.setVisible(true);
	F.setLayout(new FlowLayout());
}
}
