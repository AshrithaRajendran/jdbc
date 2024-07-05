package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Ashi@340");
		PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
		System.out.println("enter id to delete");
		Scanner scn=new Scanner(System.in);
		int id=scn.nextInt();
		ps.setInt(1, id);
		ps.execute();
		System.out.println("data deleted");
		

	}

	
}
