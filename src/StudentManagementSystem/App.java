package StudentManagementSystem;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App implements StudentManagementSystem {

    private List<User> users;
    private int userSequence = 1000;

    public App(){
        users = new ArrayList<>();
    }
    public static void main(String[] args) {
        App app = new App();
        app.addStudent();
        app.login();

    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("select your login type :");
                System.out.println("enter '1' for teacher and '2' for student");
                int choice = scanner.nextInt();
                if(choice == 1 || choice == 2){
                    break;
                }else{
                    System.out.println("invalid choice, please try again");
                }
            } catch (Exception e) {
                System.out.println("invalid choice, please try again");

            }
        }

        System.out.println("enter your email :");
        String email = scanner.next();
        System.out.println("enter your password :");
        String password = scanner.next();
        for(User u : this.users){
            if(u.email.equals(email))
            {
                if(u.password.equals(password)){
                    System.out.println("login successfull");
                }else{
                    System.out.println("invlaid creds");
                }
            }else{
                System.out.println("user does not exists");
            }
        }

    }

    @Override
    public void logout() {

    }

    @Override
    public void resetPassword() {

    }

    @Override
    public void showStudentList() {

    }

    @Override
    public void showTeacherList() {

    }

    @Override
    public void showDepartmentList() {

    }

    @Override
    public void addDepartment() {

    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.next();
        System.out.println("Enter your email :");
        String email = scanner.next();
        System.out.println("Enter your password :");
        String password = scanner.next();

        Student student = new Student(userSequence,name,email,password);
        this.userSequence++;
        users.add(student);
    }

    @Override
    public void addTeacher() {

    }

    @Override
    public void declareResult() {

    }
}
