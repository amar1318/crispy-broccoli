package utility_classes;

public class Student {
    private int id;
    private String username;
    private String password;
    private String score;

    public Student() {
    }
    
    public Student(String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(){
        this.score = score;
    }

    
}
