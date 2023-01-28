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
        ArrayList<Question> a1= new ArrayList<>();
        a1.add();
        a1.add();
        a1.add();
        a1.add();
        a1.add():
        System.out.println(a1);
        Iterator<Integer>itr=a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());        

        try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project__questiondb","root","root");
PreparedStatement statement=con.prepareStatement("insert into questions(test1,test2,test3,test4,test5)values(?,?,?,?,?)");
statement.setString(1,"first question");
statement.setString(2,"second question");
statement.setString(3,"third question");
statement.setString(4,"fourth question");
statement.setString(5,"fifth question");
int i=statement.executeUpdate();
System.out.println("Done");
con.close();
statement.close();
				


}

