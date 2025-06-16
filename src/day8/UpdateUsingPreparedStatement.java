package day8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLDatabaseConnectionKIIT.getDBConnection();
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Employee Number");
		int a=sc.nextInt();
		
		
		System.out.println("Enter New Employee Name");
		String b=sc.next();
		
		System.out.println("Enter New Employee Salary");
		double c=sc.nextDouble();
		
		
		
		String query="update emp set ename=?,sal=? where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setString(1, b);
		ps.setDouble(2, c);
		ps.setInt(3, a);
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
		System.out.println(rows +"Records Updated");
		else
		System.out.println("Error In Updation");
		
		ps.close();
		con.close();
	}

}
