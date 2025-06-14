package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{
		//Class.forName("com.mysql.cj.jdbc.Driver"); version 8
		
		Class.forName("com.mysql.jdbc.Driver"); //version 8
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kiitdb","root","");
		
		Statement st=con.createStatement();
		String query="create table emp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10),\r\n"
				+ "sal decimal(5,2))";
		
		st.execute(query);
		
		System.out.println("Table Created");
		
		st.close();
		con.close();

	}

}
