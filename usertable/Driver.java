package usertable;

import java.sql.SQLException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws SQLException {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter id");
		int id=scn.nextInt();
		System.out.println("enter name");
		String name=scn.next();
		System.out.println("enter mail");
		String mail=scn.next();
		System.out.println("enter password");
		int password=scn.nextInt();
		UserDao.saveUser(id,name,mail,password);
		
		
	}

}
