package batchProcessingwithpreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class batchprocessingWithPS {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Ashi@340");
		PreparedStatement ps=con.prepareStatement("insert into employee(id,name,role,yoe,salary) values(?,?,?,?,?)");
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("eneter id");
			int id=scn.nextInt();
			System.out.println("eneter name");
			String name=scn.next();
			System.out.println("eneter role");
			String role=scn.next();
			System.out.println("eneter yoe");
			int yoe=scn.nextInt();
			System.out.println("eneter salary");
			double salary=scn.nextDouble();
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setString(3, role);
			ps.setInt(4, yoe);
			ps.setDouble(5,salary);
			ps.addBatch();
		}
		ps.executeBatch();
		System.out.println("batch executed Successfully");
		

	}

}
