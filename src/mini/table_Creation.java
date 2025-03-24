package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class table_Creation {

	public void table () throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pirates","root","yogesh");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table name : ");
		String str = sc.nextLine();
		
		stmt.executeUpdate("create table " + str + " (name varchar(50), address varchar(200), phone_number int)");
		System.out.println("Table Created");
	}
}
