package project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class meetingin extends conn {
	public meetingin() {// 멤버 등록
		try {
			connDB();
			JFrame JF = new JFrame("등록");
			JF.getContentPane().setBackground(Color.WHITE);
			JF.setSize(210, 322);
			JButton btn1 = new JButton("등록");
			btn1.setBounds(22, 208, 57, 23);
			JLabel JL1 = new JLabel("모임 장소");
			JL1.setBounds(66, 5, 52, 15);
			JLabel JL2 = new JLabel("참가 이름");
			JL2.setBounds(66, 51, 52, 15);
			JLabel JL3 = new JLabel("인원");
			JL3.setBounds(76, 97, 24, 15);
			JLabel JL4 = new JLabel("정산금액 총액");
			JL4.setBounds(49, 153, 76, 15);
			JTextField TF1 = new JTextField(20);
			TF1.setBounds(12, 25, 160, 21);
			JTextField TF2 = new JTextField(20);
			TF2.setBounds(12, 71, 160, 21);
			JTextField TF3 = new JTextField(20);
			TF3.setBounds(12, 122, 160, 21);
			
			JTextField TF4 = new JTextField(20);
			TF4.setBounds(12, 173, 160, 21);
			JF.getContentPane().setLayout(null);
			JF.getContentPane().add(JL1);
			JF.getContentPane().add(TF1);
			JF.getContentPane().add(JL2);
			JF.getContentPane().add(TF2);
			JF.getContentPane().add(JL3);
			JF.getContentPane().add(TF3);
			JF.getContentPane().add(JL4);
			JF.getContentPane().add(TF4);
			JF.getContentPane().add(btn1);
			
			JButton btn1_1 = new JButton("취소");
			btn1_1.setBounds(91, 208, 57, 23);
			JF.getContentPane().add(btn1_1);

			JF.setVisible(true);
			JF.setLocation(400, 100);
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String intro = TF1.getText();
					String member = TF2.getText();
					String ps=TF3.getText();
					int ps2 = Integer.parseInt(TF3.getText());
					String debt = TF4.getText();
					int debt2=Integer.parseInt(TF4.getText());
					String query = "insert into meeting (num,intro,member,ps,debt)values(auto1.nextVal,'" + intro
							+ "','" + member + "','" + ps + "','" + debt + "')";
					System.out.println(query);
					String query2 = "insert into pay values (auto3.nextVal,'"+intro+"',"+debt2/ps2+")";
					System.out.println(query2);
					try {
						boolean b = stmt.execute(query);
						for(int i =0;i<ps2;i++) {
						boolean c= stmt.execute(query2);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						System.out.println(e1);
					}
				}
			});
//			rs=stmt.executeQuery(query);

		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
