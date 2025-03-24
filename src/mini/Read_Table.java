package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Read_Table {

	public void readtable() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pirates","root","yogesh");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table name : ");
		String str = sc.nextLine();
		ResultSet eq = stmt.executeQuery("select *from " + str);
		while(eq.next()) {
			System.out.println(eq.getString(1) + " " + eq.getString(2) + " " + eq.getInt(3));
		}
		System.out.println("Finish");
	}
}
