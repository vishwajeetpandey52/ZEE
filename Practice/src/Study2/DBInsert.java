package Study2;
import java.sql.*;
public class DBInsert {
	public static void main(String[] args) {
		try {
		//	Class.forName("oracle.jbc.driver.OracleDriver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			Statement stmt=con.createStatement();
			stmt.execute("Insert into empl values(11,'Darshan',25,3000,'Dev')");
			con.close();
			System.out.println("New Data inserted");
					
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	
}
