package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class College {

    private int id;
    private String name;
    private String address;
    private String website;
    private ArrayList<Department> departments;

    public College(){
        departments = new ArrayList();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    // add department to list
    public  void setDepartments(Department d){
        this.departments.add(d);
    }

    public void addDepartment(){
        Department department = new Department();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter department id:");
        department.setId(scanner.nextInt());
        System.out.println("enter department name:");
        department.setName(scanner.next());
        this.departments.add(department);
    }

    // get list of all departments
    public ArrayList<Department> getDepartments(){
        return this.departments;
    }

    // get department by id
    public Department getDepartmentById(int id){
        for(Department d:this.departments){
            if(d.getId() == id){
                return d;
            }
        }
        return null;
    }

    public void  printDepartmentList(){
        // printing list of departments
        for(Department d :this.getDepartments()){
            System.out.println("id:"+d.getId()+" name:"+d.getName());
        }
    }

    public void printListOfAllTeacher(){
        for(Department d :this.getDepartments()){
            d.printTeacherList();
        }
    }

    public void printListOfAllStudent(){
        for(Department d :this.getDepartments()){
            d.printStudentList();
        }
    }
}
