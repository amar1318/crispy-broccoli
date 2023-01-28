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
	 public class Questiondb2 {
	PreparedStatement prs=null;
	Connection con=null;
	public void insertQuestions(String username,String score) {
		 try {
			 ConnectionTest connectionTest=new ConnectionTest();
			 con=connectionTest.getConnectionDetails();
			 prs=con.prepareStatement("insert into project__questiondb(username,score)values(?,?)");
			 prs.setString(1, "username");
			 prs.setString(2,score);
			 int i=prs.executeUpdate();
			 System.out.println("Done"+i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	
	 public static void main(String[] args) throws SQLException {
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<3;i++) {
			 System.out.println("enter username");
			 String userName=sc.next();
			 System.out.println("enter score");
			 String score=sc.next();
			 
			 Questiondb2 qs=new Questiondb2();
			 qs.insertData(userName,score);
		 }
		 sc.close();
	
		 

	}

}

