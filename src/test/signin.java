package test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class signin extends conn{
	public signin(String id,String pwd,String name,String Tnum) {

		try {
			connDB();
			
			String query = "INSERT INTO sign(num,id,pwd,name,Tel_num) VALUES(auto.nextval,'"+id+"','"+pwd+"','"+name+"','"+Tnum+"')";
			boolean b = stmt.execute(query);
			Frame signinF = new Frame("회원가입 성공");
			signinF.setSize(200,200);
			signinF.setLayout(new FlowLayout());
			Label signinLabbel= new Label("회원가입 완료");
			Button signinButton = new Button("돌아가기");
			
			signinF.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			signinButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					signinF.dispose();
				}
			});
			
			signinF.add(signinLabbel);
			signinF.add(signinButton);
			signinF.setVisible(true);
			
		}
		catch (Exception e) 
		{
			System.out.print(e);
		}

	}
}
