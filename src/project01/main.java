package project01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {
	public main(String id) {
		JLabel idup= new JLabel(id+"님 환영합니다!!!!");
		if(id.equals("admin")) {
			idup.setText("관리자 모드입니다.");
		}
		idup.setBounds(92, 19, 151, 21);
		JFrame mainf=new JFrame("메인화면");
		mainf.setSize(303,239);
		ImageIcon Btn1 = new ImageIcon("C:\\hyunho\\사람.PNG");
		JButton btn1=new JButton(Btn1);
		btn1.setFocusPainted(false);
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(22, 50, 100, 50);
		JPanel mainF=new JPanel();
		mainF.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retrieve a=new Retrieve();
//				if(id.equals("admin")) {Retrieve a=new Retrieve();}
//				else {JFrame er= new JFrame("접근불가");
//				JLabel erl= new JLabel("권한이 없습니다.");
//				er.setSize(100,80);
//				er.add(erl);
//				er.setVisible(true);
//				}
			}
		});
		ImageIcon Btn2 = new ImageIcon("C:\\hyunho\\달력.PNG");
		JButton btn2=new JButton(Btn2);
		btn2.setBackground(Color.WHITE);
		btn2.setFocusPainted(false);
		btn2.setBounds(22, 120, 100, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meetingin a = new meetingin();
			}
		});
		ImageIcon Btn3 = new ImageIcon("C:\\hyunho\\일정.PNG");
		JButton btn3=new JButton(Btn3);
		btn3.setFocusPainted(false);
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(159, 120, 100, 50);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meetingL a = new meetingL();
			}
		});
		ImageIcon Btn4 = new ImageIcon("C:\\hyunho\\머니.PNG");
		JButton btn4=new JButton(Btn4);
		btn4.setFocusPainted(false);
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(159, 50, 100, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pay a = new pay();
			}
//				System.out.print(id);
//				if(id.equals("admin")) {pay a = new pay();}
//				else {JFrame er= new JFrame("접근불가");
//				JLabel erl= new JLabel("권한이 없습니다.");
//				er.setSize(100,80);
//				er.add(erl);
//				er.setVisible(true);
//				}
//			}
		});
		
		
		mainf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		mainf.getContentPane().add(mainF);
		mainf.setLocation(400, 100);
		mainF.setLayout(null);
		mainF.add(idup);
		
		mainF.add(btn1);
		
		mainF.add(btn2);
		mainF.add(btn3);
		mainF.add(btn4);
		mainf.setVisible(true);
	}

}