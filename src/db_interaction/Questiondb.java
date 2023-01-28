package db_interaction;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import utility_classes.Question;

public class Questiondb {

    private Connection connection;
    public Questiondb(Connection connection){
        this.connection = connection;
    }

    public static List<Question> getRandomQuestions(){
        List<Question> questions = new ArrayList<>();

        try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project__questiondb","root","root");
conn.createStatement();
Statement statement =conn.createStatement();
statement.execute(sql);
conn.close();
statement.close();

        } catch (Exception e) {
          e.printStackTrace();  
        }

        //shuffle questions here



        return questions;
    }

    public static void saveScore(String username, int score) {
    }
}
