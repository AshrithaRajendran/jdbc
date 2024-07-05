package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Ashi@340");
		Statement st=con.createStatement();
		st.execute("insert into  employee(id,name,role,yoe,salary) values(1,'ashritha','Mechanical',4,30.45)");
		System.out.println("insert created successfully");
	}

}

