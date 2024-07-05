package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployeeDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Ashi@340");
		Scanner scn=new Scanner(System.in);
		System.out.println("enter id");
		int id=scn.nextInt();
		System.out.println("enter name");
		String name=scn.next();
		System.out.println("enter role");
		String role=scn.next();
		System.out.println("enter year of experinece");
		String yoe=scn.next();
		System.out.println("enter salary");
		double salary=scn.nextDouble();
		PreparedStatement ps=con.prepareStatement("insert into employee(id,name,role,yoe,salary) values(?,?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setString(3, role);
		ps.setString(4, yoe);
		ps.setDouble(5, salary);
		ps.execute();
		System.out.println("insert values successfully");
		
	}

}

