package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_Table {

	public void updatetable() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pirates","root","yogesh");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table name : ");
		String str_t = sc.nextLine();
		System.out.println("Enter the set name : ");
		String str = sc.nextLine();
		System.out.println("Enter the where address : ");
		String str_w = sc.nextLine();
		PreparedStatement stmt = con.prepareStatement("update " + str_t + " set name = ? where address = ?");
		stmt.setString(1, str);
		stmt.setString(2, str_w);
		stmt.executeUpdate();
		System.out.println("A new user value updated successfully!");
	}
}
