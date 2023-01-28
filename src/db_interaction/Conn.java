package db_interaction;
import java.sql.Connection;
import java.sql.DriverManager;

//*********Devloped By::AMIT LAKADE*********
public class Conn {
    public static Connection connection;
	public static Connection getConn(){
		if(connection == null){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
			
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	return connection;
	}
}
