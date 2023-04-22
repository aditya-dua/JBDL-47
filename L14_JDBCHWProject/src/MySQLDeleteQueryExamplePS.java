import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDeleteQueryExamplePS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","password");
			
			System.out.println("Database Connection Successful!");
			
			//Statement stmt = con.createStatement();
			
			
			String query= "delete from customers where customerName = ?";
			
			// update query
			// delete query
			
			PreparedStatement stmt = con.prepareStatement("delete from customers where customerName = ?;");
			
			stmt.setString(1,"Atelier graphique");
			
			stmt.execute();
			
			/*ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				System.out.println("Customer Name : "+rs.getString("customerName"));
				
				
			}
			rs.close();
			*/
			
			
			stmt.close();
			
			
			
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
