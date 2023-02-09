package DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InsertAProduct {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/medicare";
		String username ="root";
		String password ="Sush@1203";
		String query ="Insert into Product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views) Values(\"PRDABC123DEFX\",\"Omnigel\",\"Cipla\",\"An antipyretic gel\", 18, 50, true, 1, 2, 0, 0 );";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();
		stmt.execute(query);
		
		
	}
//	@Test
//	public void DbAdded() {
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://localhost:8080/medicare");
		
		
		
	}
	
