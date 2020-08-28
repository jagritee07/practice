import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String host="localhost";

		String port= "3306";
		//making connection
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "1407");
		//setting path 
		Statement s=con.createStatement();
		//storing result
		ResultSet rs=s.executeQuery("select * from credentials where scenario ='rewardscard'");

		while(rs.next()) {
			WebDriver driver= new ChromeDriver();

			driver.get("https://login.salesforce.com");

			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
			System.out.println("successfully taken data ");
			
			

		}


	}

}
