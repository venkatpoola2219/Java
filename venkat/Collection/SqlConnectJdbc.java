package Java.Mouritech.venkat.Collection;
import java.sql.*;
public class SqlConnectJdbc {

	public static void main(String[] args){
		try {
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mouritech1","root","root");
		Statement smt=cn.createStatement();
		String q="Select * from EMPLOYEE";
		ResultSet rs=smt.executeQuery(q);
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		};
		cn.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
