package day8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Epmloyee Number");
		int a=sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String b=sc.next();
		
		System.out.println("Enter Employee Salary");
		double c=sc.nextDouble();
		
		String query="insert into emp values(?,?,?)";
		Connection con=MySQLDatabaseConnectionKIIT.getDBConnection();
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
	
		int rows=ps.executeUpdate();
		if(rows>0)
		System.out.println(rows +" Records Inserted");
		else
		System.out.println("Error In Insertion");
		
		ps.close();
		con.close();
		
		
	}

}
