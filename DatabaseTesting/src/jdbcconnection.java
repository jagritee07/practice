import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String host="localhost";

		String port= "3306";
		//making connection
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "root", "1407");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from EmployeeInfo where id =3");

while(rs.next()) {
	System.out.println(rs.getString("name"));
	System.out.println(rs.getString("location"));
	System.out.println(rs.getInt("age"));
	
}


	}

}
