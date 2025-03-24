package mini;

import java.sql.SQLException;
import java.util.Scanner;

public class Heart_Class{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Heart_Class c = new Heart_Class();
		Scanner sr = new Scanner(System.in);
		System.out.println("WELCOME TO DATABASE CREATION \n=============================");
		System.out.println("Enter the below option : \n Create Database \n Create Table \n Insert Value \n Read Table \n Update Table \n Delete Table");
		String option = sr.nextLine();
		switch (option) {
		case "create database":
			Db_Creation db = new Db_Creation();
			db.createdb();
			break;
		case "create table":
			table_Creation file = new table_Creation();
			file.table();
			break;
		case "insert value":
			Value_Insert insert = new Value_Insert();
			insert.insertvalue();
			break;
		case "read table":
			Read_Table read = new Read_Table();
			read.readtable();
			break;
		case "update table":
			Update_Table update = new Update_Table();
			update.updatetable();
			break;
		case "delete table":
			Table_Delete del = new Table_Delete();
			del.deletetable();
			break;
		default:
			System.out.println("Please select correct the option");
		}
	}
	

}
