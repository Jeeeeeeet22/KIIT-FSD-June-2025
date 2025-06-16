package day8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPreparedStatementBatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLDatabaseConnectionKIIT.getDBConnection();
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Employees");
		int size=sc.nextInt();
		
		String query="insert into emp values(?,?,?)";
		ps=con.prepareStatement(query);
		
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter Epmloyee Number");
		int a=sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String b=sc.next();
		
		System.out.println("Enter Employee Salary");
		double c=sc.nextDouble();
		
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		
		ps.addBatch();
		}
		
		int rows[]=ps.executeBatch();
		if(rows.length>0)
		System.out.println(rows.length +" Records Inserted");
		else
		System.out.println("Error In Insertion");
		
		ps.close();
		con.close();
		
		
	}

}
