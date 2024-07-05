package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class customertable {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Ashi@340");
		Statement st=con.createStatement();
		st.execute("create table customer(id int,name varchar(20),age int,accountnumber long,pincode int,ifsccode varchar(20),balance double)");
		System.out.println("table created successfully");

	}

}

