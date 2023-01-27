import java.util.List;
import java.util.Scanner;

import db_interaction.Conn;
import db_interaction.Questiondb;
import db_interaction.Studentdb;
import utility_classes.Question;
import utility_classes.Student;

public class Main {
    public static void main(String[] args) throws Exception {
        try(Scanner scan = new Scanner(System.in)){
            boolean check = true;
            Questiondb quest = new Questiondb(Conn.getConn());
            Studentdb stud = new Studentdb(Conn.getConn());
            do{
                System.out.println("quizz App");
                System.out.println("press 1 for registration");
                System.out.println("press 2 for Student log in");
                System.out.println("press 3 for exit");
                System.out.println("Enter your choice: ");
                String ch = scan.nextLine();

                switch(ch){


                    case "1":
                        System.out.println("Student Registration--");
                        System.out.println("enter username: ");
                        String username = scan.nextLine();
                        System.out.println("enter password: ");
                        String password = scan.nextLine();
                        Student student = new Student(username, password = "1234");
                        boolean flag = Studentdb.addStudent(student);
                        if(flag){
                            System.out.println("Student successfully added");
                        }else{
                            System.out.println("Username already exists");
                        }break;


                    case "2":
                        System.out.println("Student log in:");
                        System.out.println("enter username:");
                        String usernamee = scan.nextLine();
                        System.out.println("enter password: ");
                        String passwordd = scan.nextLine();
                        Student studentt = Studentdb.getStudent(usernamee, passwordd);
                        if(usernamee == null){
                            System.out.println("invalid credential");
                        }else{
                            System.out.println("welecome "+studentt.getUsername());
                            int totalQuestion = 10;
                            int score = 0;
                            List<Question> questions = Questiondb.getRandomQuestions();
                            for(int i=0; i<totalQuestion; i++){
                                Question question = questions.get(i);
                                System.out.println(question.getQuestion());
                                System.out.println("1. "+question.getOpt1());
                                System.out.println("2. "+question.getOpt2());
                                System.out.println("3. "+question.getOpt3());
                                System.out.println("4. "+question.getOpt4());
                                System.out.println("enter your ans: ");
                                int ans = scan.nextInt();
                                if(ans == question.getAns()){
                                    score++;
                                }
                            }
                            System.out.println("your score is: "+score);
                            Questiondb.saveScore(studentt.getUsername(), score);
                        }
                        break;
                    case "3":
                        check = false;
                        break;
                    default: 
                    System.out.println("please select correct number:");
                }
            }while(check);
        }
    }
}
