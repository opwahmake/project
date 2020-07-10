package test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class loginCheck extends conn{
	public loginCheck(String id,String pw) {

		try {
			connDB();
			
			String query = "select id,pwd from sign where id = '"+id+"' and pwd = '"+pw+"'";
//			boolean b = stmt.execute(query);
			System.out.println(query); 
			rs = stmt.executeQuery(query);
			rs.last();
			if(rs.getRow()==1) {main n=new main(id);}
			else {
				Frame error = new Frame ("에러");
				error.setSize(300,70);
				error.setLayout(new FlowLayout());
				Button btn1 =new Button("돌아가기");
				Label erL=new Label("아이디나 비밀번호를 확인하세요.");
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
				error.add(btn1);
				error.setVisible(true);
			}
			
			
		} catch (Exception e) {
			System.out.print(e);
		}

	}
}
