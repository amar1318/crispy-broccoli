package db_interaction;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import utility_classes.Question;

public class Questiondb {

    private Connection connection;
    public Questiondb(Connection connection){
        this.connection = connection;
    }

    public static List<Question> getRandomQuestions(){
        List<Question> questions = new ArrayList<>();

        try {
            





        } catch (Exception e) {
            // TODO: handle exception
        }

        //shuffle questions here



        return questions;
    }

    public static void saveScore(String username, int score) {
    }
}
