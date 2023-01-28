package db_interaction;
// Developed by Aniruddha
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

import java.util.*;

import utility_classes.Question;

public class Questiondb {

    private static Connection connection;
    public Questiondb(Connection connection){
        this.connection = connection;
    }

    public static List<Question> getRandomQuestions(){
        ArrayList<Question> a1= new ArrayList<>();
                      

        try {
        	Statement statement=connection.createStatement();
        	ResultSet rs=statement.executeQuery("select * from questions");
        	while(rs.next()) {
        		Question question=new Question();
        		question.setQuestion(rs.getString("question"));
        		question.setQuestion(rs.getString("opt 1"));
        		question.setQuestion(rs.getString("opt 2"));
        		question.setQuestion(rs.getString("opt 3"));
        		question.setQuestion(rs.getString("opt 4"));
        		question.setAns(rs.getInt("ans"));
        		Question.add(question);
        		
        	}
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        Collections.shuffle(a1);
        return a1;
    }
    public void saveScore(String username,int score) {
    	try {
    		PreparedStatement ps=connection.prepareStatement("insert into score values(?,?,?,?)");
    		ps.setString(1, username);
    		ps.setInt(2,score);
    		ps.executeUpdate();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}


