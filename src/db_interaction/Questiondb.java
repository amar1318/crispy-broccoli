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
                     

        Questions q1 = new Questions(" Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Questions q2 = new Questions("What is the extension of java code files?", " A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Questions q3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");
                           


        return questions;
    }

    public static void saveScore(String username, int score) {
    }
}
