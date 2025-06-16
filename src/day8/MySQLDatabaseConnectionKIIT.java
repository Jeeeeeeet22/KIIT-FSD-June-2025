//utility classes
package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabaseConnectionKIIT {
	
		static Connection con=null;
		static String dbName="jdbc:mysql://localhost:3306/kiitdb";
		static String userName="root";
		static String password="";
		
		public static Connection getDBConnection() throws SQLException, ClassNotFoundException
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbName, userName,"");
			return con;
		}
}