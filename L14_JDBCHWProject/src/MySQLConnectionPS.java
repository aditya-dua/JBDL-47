import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionPS {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl47","root","password");
			
			System.out.println("Database Connection Successful!");
			
//			Statement stmt = con.createStatement();
//			String query= "Create Database jbdl47";
//			
//			stmt.execute(query);
//			System.out.println("DB is Created");
			
			con.setAutoCommit(false);
			
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, 1);
			ps.setString(2,"Aditya");
			ps.setString(3,"JBDL");
			ps.setInt(4, 1);
			
			ps.execute();
			
			con.commit();
			
			ps.close();
			
			
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			con.rollback();
			e.printStackTrace();
		}
		
	}

}
