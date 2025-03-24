package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Value_Insert extends table_Creation {

	public void insertvalue() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pirates","root","yogesh");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table name: ");
		String str = sc.nextLine();
		PreparedStatement stmt = con.prepareStatement("insert into " + str + " (name,address,phone_number) values (?,?,?)");
		
		System.out.println("Enter your name : ");
		String str_n = sc.nextLine();
		System.out.println("Enter your address : ");
		String str_a = sc.nextLine();
		System.out.println("Enter your phone number : ");
		int num = sc.nextInt();
		
		stmt.setString(1, str_n);
		stmt.setString(2, str_a);
		stmt.setInt(3, num);
		
		stmt.executeUpdate();
		
		System.out.println("A new user data inserted successfully!");
	}
}
