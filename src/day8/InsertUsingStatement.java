package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver"); version 8
		
		Class.forName("com.mysql.jdbc.Driver"); //version 8
		try
		{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kiitdb","root","");
		
		Statement st=con.createStatement();
		String query="insert into emp values(103,'Chris',900.00)";
		
		int rows=st.executeUpdate(query);
		if(rows>0)
		System.out.println("Record Inserted");
		else
		System.out.println("Error In Insertion");
		
		st.close();
		con.close();
		}
		catch(SQLException e1)
		{
			System.out.println(e1.getMessage());
		}

	}

}
