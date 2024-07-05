package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Ashi@340");
		PreparedStatement ps=con.prepareStatement("update employee set name=?,salary=?,yoe=?,role=? where id=?");
		Scanner scn=new Scanner(System.in);
		System.out.println("enter new name");
		String name=scn.next();
		System.out.println("enter id");
		int id=scn.nextInt();
		System.out.println("enter role");
		String role=scn.next();
		System.out.println("enter year of experinece");
		String yoe=scn.next();
		System.out.println("enter salary");
		double salary=scn.nextDouble();
		ps.setString(1,name);
		ps.setInt(5,id);
		ps.setString(3, role);
		ps.setString(4, yoe);
		ps.setDouble(5, salary);
		ps.execute();
		System.out.println("values updated");
		

	}

}
