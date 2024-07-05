package usertable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcdemo.Helper;

public class UserDao {
public static void saveUser(int id,String name,String mail,int password) throws SQLException
{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Ashi@340");
	PreparedStatement ps=con.prepareStatement("insert into user(id,name,mail,password) values(?,?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setString(3, mail);
	ps.setInt(4,password);
	ps.execute();
	System.out.println("data inserted succesfully");
}
	
	}


