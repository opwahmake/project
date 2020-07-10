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

public class Login2 extends conn {
//	public static void main(String[] args) {
	public Login2(){
		JFrame F= new JFrame("로그인");
		
		JPanel f = new JPanel();
		f.setBackground(Color.WHITE);
		F.setBackground(Color.WHITE);
		ImageIcon ic  = new ImageIcon("C:\\hyunho\\소모임.PNG");
		ImageIcon ic22  = new ImageIcon("C:\\hyunho\\소모임.PNG");
		f.setBounds(126, 470, 210, 103);
		F.setSize(472,600);
		F.setLocation(400, 100);
		
		F.getContentPane().setLayout(null);
		JButton btn2=new JButton("로그인");
		btn2.setBackground(Color.WHITE);
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
		JButton btn1= new JButton("회원가입");
		btn1.setBackground(Color.WHITE);
//		btn1.setBorderPainted(false);
//		B1.setContentAreaFilled(false);
//		btn1.setFocusPainted(false);

		btn1.setFocusPainted(false);
		btn1.setBounds(111, 62, 87, 23);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUp sp = new signUp();				
			}
		});
		f.add(btn1);
				JLabel ic3 = new JLabel(ic22);
//				JButton ic2 = new JButton(ic);
//				ic2.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//					}
//				});
//				F.getContentPane().add(ic2);
				F.getContentPane().add(ic3);
				ic3.setBounds(-16, 0, 757, 613);
		F.setUndecorated(true);
		F.setVisible(true);
}
}