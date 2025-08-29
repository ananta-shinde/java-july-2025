package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

    private int id;
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public Department(){
        students = new ArrayList<>();
        teachers =new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student getStudentById(int id){
        for(Student s :this.students)
        {
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public void addStudent(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student id:");
        student.setId(scanner.nextInt());
        System.out.println("enter student name:");
        student.setName(scanner.next());
        System.out.println("enter student email:");
        student.setEmail(scanner.next());
        System.out.println("enter student password:");
        student.setPassword(scanner.next());
        this.students.add(student);
    }

    public ArrayList<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addTeacher(){
        Teacher teacher = new Teacher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Teacher id:");
        teacher.setId(scanner.nextInt());
        System.out.println("enter Teacher name:");
        teacher.setName(scanner.next());
        System.out.println("enter Teacher email:");
        teacher.setEmail(scanner.next());
        System.out.println("enter Teacher password:");
        teacher.setPassword(scanner.next());
        this.teachers.add(teacher);
    }

    public void  printTeacherList(){
        // printing list of departments
        for(Teacher t :this.getTeachers()){
            System.out.println("id:"+t.getId()+" name:"+t.getName());
        }
    }
    public void  printStudentList(){
        // printing list of departments
        for(Student s :this.getStudents()){
            System.out.println("id:"+s.getId()+" name:"+s.getName());
        }
    }
}
