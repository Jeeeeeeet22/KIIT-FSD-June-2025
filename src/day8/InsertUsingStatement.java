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
		String query1="insert into emp values(104,'David',900.00)";  //return 1 delete from emp where dname like 'IT' return 5
		String query2="insert into emp values(105,'Elcid',850.00)";  //return 1
		String query3="insert into emp values(106,'Frank',750.00)";  //return 1
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		
		// 0 1 2
		// 1 1 1
		int rows[]=st.executeBatch();
		if(rows.length>0)
		System.out.println(rows.length +"Records Inserted");
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
