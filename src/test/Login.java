package test;


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
		JFrame F= new JFrame("로그인");
		JPanel f = new JPanel();
		f.setBackground(Color.WHITE);
		ImageIcon ic  = new ImageIcon("C:\\hyunho\\소모임.PNG");
		f.setBounds(117, 437, 210, 103);
		F.setSize(465,587);
		
		F.getContentPane().setLayout(null);
		JButton btn2=new JButton("Login");
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
					Frame error = new Frame ("에러");
					error.setSize(300,70);
					error.setLayout(new FlowLayout());
					Button btn1 =new Button("돌아가기");
					Label erL=new Label("아이디나 비밀번호를 입력하세요.");
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
				System.exit(0);
			}
		});
		f.setLayout(null);
		
		f.add(tid);
		
		f.add(tpw);
		f.add(btn2);
		F.getContentPane().add(f);
		JButton btn1_1= new JButton("SignIN");
		btn1_1.setBounds(111, 62, 87, 23);
		
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUp sp = new signUp();				
			}
		});
		f.add(btn1_1);
		JLabel ic2 = new JLabel(ic);
		F.getContentPane().add(ic2);
		ic2.setBounds(0, 0, 678, 554);
		F.setVisible(true);
}
}