package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	public static Connection getConnect() throws SQLException 
	{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Ashi@340");
	}

}
