package day8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con=MySQLDatabaseConnectionKIIT.getDBConnection();
		
		Statement st=con.createStatement();
		String query="delete from emp where eno=107";
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
		System.out.println(rows +"Records Deleted");
		else
		System.out.println("Error In Deletion");
		
		st.close();
		con.close();

	}

	

}
