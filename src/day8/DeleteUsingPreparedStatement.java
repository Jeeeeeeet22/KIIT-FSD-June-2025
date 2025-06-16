package day8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLDatabaseConnectionKIIT.getDBConnection();
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Employee Number");
		int a=sc.nextInt();
		
		String query="delete from emp where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, a);
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
		System.out.println(rows +"Records Deleted");
		else
		System.out.println("Error In Deletion");
		
		ps.close();
		con.close();
	}

}
