package project01;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends conn {
	public static void main(String[] args) {
		JFrame F= 
				new JFrame("�α���");
		
		JPanel f = new JPanel();
		f.setBackground(Color.WHITE);
		F.setBackground(Color.WHITE);
		ImageIcon ic  = new ImageIcon("C:\\hyunho\\�Ҹ���.PNG");
		ImageIcon ic22  = new ImageIcon("C:\\hyunho\\��.jpg");
		f.setBounds(229, 271, 210, 103);
		F.setSize(700,419);
		F.setLocation(400, 100);
		
		F.getContentPane().setLayout(null);
		JButton btn2=new JButton("Login");
		btn2.setFocusPainted(false);
		btn2.setBounds(18, 62, 81, 23);
		JPasswordField tpw=new JPasswordField(20);
		tpw.setBounds(18, 34, 180, 23);		
		JTextField tid=new JTextField(20);
		tid.setBounds(18, 5, 180, 23);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tid.getText();
				String pw=tpw.getText();
				if(id.equals("")||pw.equals("")){
					Frame error = new Frame ("����");
					error.setSize(300,70);
					error.setLayout(new FlowLayout());
					Button btn1 =new Button("���ư���");
					Label erL=new Label("���̵� ��й�ȣ�� �Է��ϼ���.");
					error.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e) {
							error.dispose();
						}
					});
					btn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							error.dispose();
						}
					});
					error.add(erL);
					error.add(
							btn1);
					error.setVisible(true);
				}
				else {
					loginCheck lo=new loginCheck(id,pw);}
				
			}	
		});
		

		F.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			
				Login2 L=new Login2();
//				F.dispose();
			}
		});
		f.setLayout(null);
		
		f.add(tid);
		
		f.add(tpw);
		f.add(btn2);
		F.getContentPane().add(f);
		JButton btn1_1= new JButton("SignIN");

		btn1_1.setFocusPainted(false);
		btn1_1.setBounds(111, 62, 87, 23);
		
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUp sp = new signUp();				
			}
		});
		f.add(btn1_1);
				JLabel ic3 = new JLabel(ic22);
//				JButton ic2 = new JButton(ic);
//				ic2.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//					}
//				});
//				F.getContentPane().add(ic2);
				F.getContentPane().add(ic3);
				ic3.setBounds(-45, 0, 757, 613);
//		F.setUndecorated(true);
		F.setVisible(true);
}
}