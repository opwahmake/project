package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class pay extends conn {
	JFrame F = new JFrame("더치페이");

	public pay() {
		F.getContentPane().setBackground(Color.WHITE);
		F.setSize(478, 479);
		F.getContentPane().setLayout(new FlowLayout());
		F.setVisible(true);
		
		try {
			connDB();
			String query = "select * from pay";
			rs = stmt.executeQuery(query);
			rs.first();
			do {
//				JPanel f= new JPanel();
//				f.getRootPane().setBackground(Color.WHITE);
				String a = rs.getString("intro");
				String b = rs.getString("pay");
				String c = rs.getString("no");
//				JLabel J1 = new JLabel(a);
//				JLabel J2 = new JLabel(b);
				JButton B1 = new JButton(a+b);
				B1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						B1.setText("완료");
//						f.remove(J1);
//						f.remove(J2);
						F.remove(B1);
						try {
							String query = "delete from pay where no ="+c;
							rs = stmt.executeQuery(query);

						}
						catch(SQLException e2){
							System.out.print("aa");
						}

					}
				});
//				f.add(J1);
//				f.add(J2);
				F.getContentPane().add(B1);

			} while (rs.next());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
