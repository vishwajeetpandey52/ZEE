package Study2;
import java.util.*;

//import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class DBClass2 {
	public static void main(String[] args) {
		Connection con = null;
		try {
		//	Class.forName("oracle.jbc.driver.OracleDriver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			
		//	PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
			//PreparedStatement pstmt=con.prepareStatement("delete from emp where id =?");
		//	PreparedStatement pstmt=con.prepareStatement("update emp set name = ? ,salary = ? where id =?");
			
//			Scanner sc=new Scanner(System.in);
//		
//			System.out.println("Enter id: ");
//			int id=sc.nextInt();
//			
//			
//			
//			System.out.println("Enter name: ");
//			String name=sc.next();
//			
//			
//			
//			System.out.println("Enter age: ");
//			int age=sc.nextInt(); 
//			
//			System.out.println("Enter salary: ");
//			int salary=sc.nextInt();
//			
//			System.out.println("Enter designation: ");
//			String desig=sc.next();
//			pstmt.setInt(1, id);
//			pstmt.setString(2, name);
//			pstmt.setInt(3, age);
//			pstmt.setInt(4, salary);
//			pstmt.setString(5, desig); 
			
			//List h = new ArrayList();
			 Statement stmt =con.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from emp");
			// DatabaseMetaData mdData = con.getMetaData();
			 //ResultSet col = mdData.getColumns(null, null, "emp", null);
			 ResultSetMetaData r=rs.getMetaData();
			 
			 while(rs.next()) {
//				System.out.println(rs.getInt(1)+": "+rs.getString(2)+" :"+
//			 rs.getInt(3)+" :"+rs.getInt(4)+":"+rs.getString(5));
				 System.out.print("Column name and size"+rs.getString(2));
				 System.out.print(" ("+rs.getString(2)+")");
			 }
//			pstmt.setString(2, name);
//			pstmt.setInt(3, Age);

			//pstmt.execute();
			//stmt.execute();
			//System.out.println("New Data updated");
				con.close();		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
