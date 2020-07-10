package project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pay extends conn {
	JFrame F = new JFrame("더치페이");
	
	public pay() {
		F.getContentPane().setBackground(Color.WHITE);
		F.setSize(500, 300);
		F.getContentPane().setLayout(new FlowLayout());
		F.setVisible(true);

//		int PX= 0;
//		int PY= 0;
		ImageIcon icon = new ImageIcon("C:\\hyunho\\농부.PNG");
		ImageIcon icon2 = new ImageIcon("C:\\hyunho\\농부1.PNG");
		try {
			connDB();
			String query = "select * from pay order by no desc";
			rs = stmt.executeQuery(query);
			rs.first();
			String a2 ="11";
			
			do {

				String a = rs.getString("intro");
				String b = rs.getString("pay");
				String c = rs.getString("no");
				JLabel L1= new JLabel(a+"("+b+"원)");
				JButton B1 = new JButton(icon);
				B1.setBorderPainted(false);
//				B1.setContentAreaFilled(false);
				B1.setFocusPainted(false);
				B1.setBackground(Color.WHITE);
				JPanel P=new JPanel();
				P.setBackground(Color.WHITE);
				P.setLayout(new FlowLayout());
				B1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						B1.setIcon(icon2);
//						B1.setText("");
//						P.remove(B1);
						try {
							String query = "delete from pay where no ="+c;
							rs = stmt.executeQuery(query);

						}
						catch(SQLException e2){
							System.out.print("aa");
						}

					}
				});

				if(a.equals(a2)) {					
				}else {
					P.add(L1);
//					P.setBounds(PX, PY+=50, 300, 50);
				}
				a2=a;
				F.setLocation(400, 100);
				P.add(B1);
				F.add(P);
			} while (rs.next());
		} catch (SQLException e) {
			JButton B1 = new JButton("빚진사람이없어요!",icon2);
			B1.setBorderPainted(false);
//			B1.setContentAreaFilled(false);
			B1.setFocusPainted(false);
			B1.setBackground(Color.WHITE);
			F.getContentPane().setLayout(new GridLayout());
			F.add(B1);
		}

	}

}
