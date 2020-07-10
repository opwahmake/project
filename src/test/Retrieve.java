package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Retrieve extends conn{
	public Retrieve() {//멤버 조회 페이지 구현
		try {
			connDB();
			JTable table;
			JScrollPane scrollPane;
			JFrame f =new JFrame("test");
			JPanel j =new JPanel();
			j.setBackground(Color.WHITE);
			JButton jb=new JButton("조회");
//			f.setLayout(null);
			f.setSize(500,500);
			String query="select * from sign";
			rs=stmt.executeQuery(query);
			rs.first();
			
			
			String colName[]= {"아이디","성명","핸드폰","가입일자"};
			DefaultTableModel model=new DefaultTableModel(colName,0);
			jb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						while(rs.next()) {
							String a=rs.getString("id");
							String b=rs.getString("name");
							String c=rs.getString("tel_num");
							String d=rs.getString("dat");
						model.addRow(new Object[] {a,b,c,d});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
//			while(rs.next()) {
//				String a=rs.getString("id");
//				String b=rs.getString("name");
//				String c=rs.getString("tel_num");
//				String d=rs.getString("dat");
//			model.addRow(new Object[] {a,b,c,d});
//			}
			j.add(jb);
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					f.dispose();
				}
			});
			table=new JTable(model);
			scrollPane=new JScrollPane(table);
			scrollPane.setBackground(Color.WHITE);
			scrollPane.setSize(400,400);
			j.setSize(500,500);
			j.add(scrollPane);
			f.getContentPane().add(j);
			f.setVisible(true);
			
						
		} catch (Exception e) {
			System.out.print(e);
		}

	}
}
