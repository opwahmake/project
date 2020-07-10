package test;


import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;


public class signUp {
	
	public signUp() {
		Frame SF= new Frame("Sign up");
		JPanel sf=new JPanel();
		sf.setBackground(Color.WHITE);
		sf.setSize(200,400);
		SF.setSize(200,325);
		JButton signin=new JButton("회원가입");
		signin.setBounds(12, 233, 81, 38);
		JButton cc=new JButton("돌아가기");
		cc.setBounds(98, 233, 81, 38);
	
		JLabel lid =new JLabel("아이디");
		lid.setBounds(79, 5, 36, 15);
		Label lpwd =new Label("비밀번호");
		lpwd.setBounds(66, 53, 62, 23);
		Label lname =new Label("이름");
		lname.setBounds(78, 109, 38, 23);
		Label lTnum =new Label("핸드폰 번호");
		lTnum.setBounds(58, 165, 77, 23);
		
		TextField id=new TextField(20);
		id.setBounds(15, 25, 164, 23);
		TextField pwd=new TextField(20);
		pwd.setBounds(15, 81, 164, 23);
		TextField name=new TextField(20);
		name.setBounds(15, 137, 164, 23);
		TextField Tnum=new TextField(20);
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
		SF.add(sf);
		SF.setVisible(true);
	
	}


	
}
