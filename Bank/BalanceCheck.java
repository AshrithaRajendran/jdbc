package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BalanceCheck {

	public static void main(String[] args) throws SQLException
	
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter Account number");
		long Accnum=scn.nextLong();
		System.out.println("enter pincode");
		int pincode=scn.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Ashi@340");
		PreparedStatement ps=con.prepareStatement("select* from customer where accountnumber=? and pincode=?");
		ps.setLong(1,Accnum);
		ps.setInt(2, pincode);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println("balance is:"+rs.getDouble(7));	
		}
		else
		{
			System.out.println("Invalid Accountnumber or pincode");
		}

	}

}
