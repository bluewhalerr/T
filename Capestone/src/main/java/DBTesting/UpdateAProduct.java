package DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAProduct {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/medicare";
		String username ="root";
		String password ="Sush@1203";
		String query ="Update Product set quantity= 65 where name= 'Omnigel';";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		
	}
	
}

