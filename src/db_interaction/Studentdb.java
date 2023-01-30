package db_interaction;

import java.sql.Connection;

import utility_classes.Student;
//*****Developed by aniket*****
public class Studentdb {
    private Connection connection;
    public Studentdb(Connection connection){
        
    }

    public static boolean addStudent(Student st){
        try {
             PreparedStatement ps2 = connection.prepareStatement("SELECT EXISTS (SELECT * FROM quiz WHERE student = ?) as 'check'");//sql query check exist user
            ps2.setString(1, st.getid());
            ResultSet rs2 = ps2.executeQuery();
            if(rs2.next()) {
                if(rs2.getInt("check")==1){
                    return false;
                }
            }
            PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?)");//sql query add value
            ps.setString(1, st.getPassword());
            ps.setString(2, st.getName());
            ps.setString(3, st.getScore());
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static Student getStudent(String name, String password){
        try {
            PreparedStatement ps = connection.prepareStatement("select * from user where student = ? and password = ?"); //sql query to get value
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                user = new User(rs.getString("password"), rs.getString("name"), rs.getString("score"));
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }
}
