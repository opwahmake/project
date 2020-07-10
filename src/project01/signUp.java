package project01;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class signUp {
	
	public signUp() {
		JFrame SF= new JFrame("회원 가입");
		JPanel sf=new JPanel();
		sf.setBackground(Color.WHITE);
		sf.setSize(200,400);
		SF.setSize(200,325);
		JButton signin=new JButton("회원가입");
		signin.setBorderPainted(false);
		signin.setBackground(Color.white);
//		B1.setContentAreaFilled(false);
		signin.setFocusPainted(false);
		signin.setBounds(12, 233, 89, 38);
		JButton cc=new JButton("돌아가기");
		cc.setBorderPainted(false);
		cc.setBackground(Color.GRAY);
//		B1.setContentAreaFilled(false);
		cc.setFocusPainted(false);
		cc.setBounds(90, 233, 89, 38);
	
		JLabel lid =new JLabel("아이디");
		lid.setBounds(71, 6, 36, 15);
		JLabel lpwd =new JLabel("비밀번호");
		lpwd.setBounds(68, 55, 62, 23);
		JLabel lname =new JLabel("이름");
		lname.setBounds(77, 110, 38, 23);
		JLabel lTnum =new JLabel("핸드폰 번호");
		lTnum.setBounds(63, 166, 77, 23);
		
		JTextField id=new JTextField(20);
		id.setBounds(15, 25, 164, 23);
		JTextField pwd=new JTextField(20);
		pwd.setBounds(15, 81, 164, 23);
		JTextField name=new JTextField(20);
		name.setBounds(15, 137, 164, 23);
		JTextField Tnum=new JTextField(20);
		Tnum.setBounds(15, 193, 164, 23);
		SF.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				SF.dispose();
			}
		});
		SF.setResizable(false);
		sf.setLayout(null);

		sf.add(lid);		
		sf.add(id);
		sf.add(lpwd);
		sf.add(pwd);
		sf.add(lname);		
		sf.add(name);
		sf.add(lTnum);
		SF.setLocation(400, 100);
		sf.add(Tnum);
		sf.add(signin);
		sf.add(cc);
		signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sid=id.getText();
				String spwd=pwd.getText();
				String sname=name.getText();
				String sTnum=Tnum.getText();				
				signin si=new signin(sid,spwd,sname,sTnum);
			}
		});
		cc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				SF.dispose();
			}
		});
		SF.getContentPane().add(sf);
		SF.setVisible(true);
	
	}


	
}
