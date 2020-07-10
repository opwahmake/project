package project;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class MemberTest {  static MemberDAO dao;
static Frame f;
static TextField name, sal,msg;
static Button btn;

public static void main(String[] args) {
   dao = new MemberDAO();//�ٸ� Ŭ���� ȣ���ν��Ͻ�
   f = new Frame("������� ��ȸ");//������ ���� �̸��� "EMP"��
   f.setSize(460, 100);//�������� ������ ����
   f.setLayout(new FlowLayout());//���̾ƿ� ���� ����
   f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
   });//�ݱ� ��ư Ȱ��ȭ
   Label lid = new Label("name : ", Label.RIGHT);//�󺧷� name : �̶�� ���ڸ� ����ϴ� �� ����
   Label lpwd = new Label("salary : ", Label.RIGHT);//�󺧷� salary : ��� ���ڸ� ����ϴ� �� ����
   name = new TextField(10);//name�̶�� 10ĭ¥�� �ؽ�Ʈ �ʵ带 ����
   sal = new TextField(10);//sal�̶�� 10ĭ¥�� �ؽ�Ʈ �ʵ带 ����
   msg=new TextField(40);
   msg.setEditable(false);
   //      sal.setEchoChar('*');
   btn = new Button("Login");//Login�̶� ������ btn��ư�� ����
   btn.addActionListener(new ActionListener() {//btn��ư�� ������ ��� �׼Ǹ����ʸ� ȣ��
      public void actionPerformed(ActionEvent e) {//�׼� ����ȣ��
         sal.setText("");//sal�� ������ �ؽ�Ʈ�� ����
         msg.setText("");
     
         System.out.println(name.getText());//name�� �ؽ�Ʈ �ʵ忡 �ִ� ���� �� ȣ��
         System.out.println(sal.getText());//sal�� �ؽ�Ʈ �ʵ忡 �ִ� ���ڸ� ȣ��
         if(name.getText().equals(""))msg.setText("������� �Է��ϼ���");
         else {
         ArrayList<MemberVo> list = dao.list(name.getText());
         if(list.size()==0)msg.setText("��ġ�ϴ� ������� �����ϴ�.");
         else msg.setText("��ȸ �Ͽ����ϴ�.");
         for (int i = 0; i < list.size(); i++) {//list.size() ��ŭ ������ ����
            MemberVo data = (MemberVo) list.get(i);
            String empno = data.getEmpno();
            String ename = data.getEname();
            int iSal = data.getSal();
            sal.setText(Integer.toString(iSal));

            System.out.println(empno + " : " + ename + " : " + sal);
         }}
      }
   });

   f.add(lid);
   f.add(name);
   f.add(lpwd);
   f.add(sal);
   f.add(btn);
   f.add(msg);
   f.setVisible(true);

//   System.out.print("Input ename...?");
//   Scanner sc = new Scanner(System.in);
//   String inp = sc.next();
//
//   System.out.println(inp);
//   sc.close();
}
}
