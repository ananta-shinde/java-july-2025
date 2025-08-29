package StudentManagementSystem;

public class App {
    public static void main(String[] args) {
            College college  = new College();
            college.addDepartment();
            college.getDepartmentById(100).addTeacher();
            college.getDepartmentById(100).addStudent();
        System.out.println("**************");
            college.printDepartmentList();
        System.out.println("**************");
            college.printListOfAllTeacher();
            college.printListOfAllStudent();






    }
}
