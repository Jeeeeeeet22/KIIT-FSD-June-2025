package day8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadUsingStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=MySQLDatabaseConnectionKIIT.getDBConnection();
		
		Statement st=con.createStatement();
		String query="select sal,ename from emp where sal>=900";
		
		ResultSet rs=st.executeQuery(query);
		System.out.println(String.format("%-15s %-15s", "Emp Name","Emp Salary"));
		while(rs.next())
		{
			System.out.println(String.format("%-15s %.3f", rs.getString("ename"),rs.getDouble("sal")));
		}	
	}
}

/*
 ---------------

            Ben
 */