package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conn {
		static String driver = "oracle.jdbc.driver.OracleDriver";
		static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		static String user = "kosea";
		static String password = "kosea2019a";
		static Connection con;
		static Statement stmt;
		static ResultSet rs;
	public static void connDB() {
		try 
		{ 
		Class.forName(driver);
        System.out.println("jdbc driver loading success");
        con = DriverManager.getConnection(url, user, password);
        System.out.println("oracle connection success");
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        System.out.println("statement create success");
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
