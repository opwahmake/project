package project01;

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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;

public class meetingL extends conn{
	public meetingL() {//멤버 조회 페이지 구현
		try {
			connDB();
			JTable table;
			JScrollPane scrollPane;
			JFrame f =new JFrame("모임이력 조회");
			JPanel j =new JPanel();
			j.setBackground(Color.WHITE);
			JButton jb=new JButton("조회");
			jb.setBackground(Color.WHITE);
			jb.setBounds(195, 450, 86, 40);
//			f.setLayout(null);
			f.setSize(500,539);
			String query="select * from meeting";
			rs=stmt.executeQuery(query);
			rs.first();
			
			
			String colName[]= {"날짜","장소","참가자","참가인원","결제금액"};
			DefaultTableModel model=new DefaultTableModel(colName,0);
			jb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						while(rs.next()) {
							String a=rs.getString("dat");
							String b=rs.getString("intro");
							String c=rs.getString("member");
							String d=rs.getString("ps");
							String E=rs.getString("debt");
						model.addRow(new Object[] {a,b,c,d,E});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			j.setLayout(null);
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
			scrollPane.setBounds(35, 22, 415, 418);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBackground(Color.WHITE);
			j.setSize(500,500);
			j.add(scrollPane);
			f.setLocation(400, 100);
			JPanel panel = new JPanel();
			scrollPane.setColumnHeaderView(panel);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane.setColumnHeaderView(scrollPane_1);
			f.getContentPane().add(j);
			f.setVisible(true);
			
						
		} catch (Exception e) {
			System.out.print(e);
		}

	}
}
