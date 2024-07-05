package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class savedata_customer {

	public static void main(String[] args) throws SQLException {
		Scanner scn=new Scanner(System.in);
		System.out.println("eneter id");
		int id=scn.nextInt();
		System.out.println("eneter name");
		String name=scn.next();
		System.out.println("eneter age");
		int age=scn.nextInt();
		System.out.println("eneter Accountnumber");
		long Accnum=scn.nextLong();
		System.out.println("eneter pincode");
		int pincode=scn.nextInt();
		System.out.println("eneter ifsc Code");
		String ifsc=scn.next();
		System.out.println("eneter balance");
		double balance=scn.nextDouble();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Ashi@340");
		PreparedStatement ps=con.prepareStatement("insert into customer(id,name,age,accountnumber,pincode,ifsccode,balance) values(?,?,?,?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setLong(4, Accnum);
		ps.setInt(5,pincode );
		ps.setString(6,ifsc );
		ps.setDouble(7, balance);
		ps.execute();
		System.out.println("data inserted successfully");
	}

}
