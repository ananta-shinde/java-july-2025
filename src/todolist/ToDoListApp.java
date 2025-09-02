package todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {

    List<Task> taskList;

    public ToDoListApp(){
        taskList = new ArrayList<>();
    }
    private int taskSequence = 1;

    public void addNewTask(){
        Task task = new Task(taskSequence);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter task description :");
        task.setDescription(scanner.nextLine());
        this.taskList.add(task);
        taskSequence++;

    }

    public void updateTask(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter Task id :");
        int taskId = scanner.nextInt();
        System.out.println("enter new status :");
        String newStatus = scanner.next();
        for(Task t : this.taskList){
            if(t.getId() == taskId){
                t.setStatus(newStatus);
            }
        }
        showTaskList();
    }

    public void showTaskList(){
        System.out.println("********************************");
        System.out.println("id     description      status");
        System.out.println("***********************************");
        for(Task t : this.taskList){
            System.out.println(t.getId()+"     "+t.getDescription()+"   "+t.getStatus());
        }
    }

    private Task getTaskById(int id){
        for(Task t : this.taskList){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    public void deleteTask(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter Task id to be deleted :");
        int taskId = scanner.nextInt();
        Task t = getTaskById(taskId);
        this.taskList.remove(t);
        showTaskList();
    }


    public static void main(String[] args) {

        ToDoListApp app = new ToDoListApp();
        app.addNewTask();
        app.addNewTask();
        app.addNewTask();
        app.showTaskList();
        app.updateTask();
        app.deleteTask();
    }
}
