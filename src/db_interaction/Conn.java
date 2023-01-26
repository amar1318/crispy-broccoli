package db_interaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Conn {
    private static Connection connection;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
			
		}
		catch(Exception e){
			e.getMessage();
		}

	}
}
