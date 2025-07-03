package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Table_Delete {

	public void deletetable() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pirates","root","yogesh");
		Statement stmt = con.createStatement();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the table name : ");
			String st = s.nextLine();
			System.out.println("Enter deletion address : ");
			String str = s.nextLine();
		int count = stmt.executeUpdate("delete from " + st + " where address = '" + str + "'");    
		if (count == 1) {
			System.out.println(count +  " row deleted");
		}
		else {
			System.out.println("no record found");
		}
	}
}
