package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Db_Creation {

	public void createdb() throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","yogesh");
		Statement stmt = con.createStatement();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Database Name :");
		String str = s.nextLine(); 
		stmt.executeUpdate("create database " + str);
		System.out.println("Databases created Successfully!");
	}
}
