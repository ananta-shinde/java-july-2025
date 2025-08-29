package collection;

import java.rmi.StubNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> studentList = new LinkedList();

        // size
        System.out.println("Size is "+studentList.size());
        // capacity not available
        // System.out.println("capacity is "+studentList.capa);

        // insert
        studentList.addFirst("Ananta");
        studentList.add("Rahul");
        studentList.addFirst("virat");
        studentList.addLast("Dhoni");

        // traversal
//        for(String s:studentList){
//            System.out.println(s);
//        }

        //read
        System.out.println(studentList.getFirst());
        System.out.println(studentList.get(3));

        //delete
        //deletes first element
        studentList.remove();

        //update
        studentList.set(2,"Yuvraj");

        System.out.println("**************************");
        Iterator itr = studentList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
