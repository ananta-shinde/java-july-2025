package StudentManagementSystem;

public class Student extends User{

    public Student(int id,String name,String email,String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = "student";
    }
}
