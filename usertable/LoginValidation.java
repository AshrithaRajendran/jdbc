package usertable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbcdemo.Helper;

public class LoginValidation {

	public static void main(String[] args) throws SQLException {
		Scanner scn=new Scanner(System.in);
		System.out.println("eneter mail");
		String mail=scn.next();
		System.out.println("enter Password");
		int password=scn.nextInt();
		Connection con=Helper.getConnect();
		PreparedStatement ps=con.prepareStatement("select * from user where mail=? and password=?");
		ps.setString(1,mail);
		ps.setInt(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("Invalid mail or password");
		}
		

	}

}
