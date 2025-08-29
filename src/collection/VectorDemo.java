package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Object[] morenames = {"Rahul","Virat",20};


        // create a vector
        Vector names = new Vector();


        // insert operation
        names.add(20);
        names.add("ananta");
        names.add(true);

        // bulk insert
        names.addAll(Arrays.asList(morenames));

        // update
        names.set(2,100);

        //search for a value
        System.out.println("search result:"+names.contains("Ananta"));

        // search and get index
        System.out.println("index result:"+names.indexOf(20));

        // search and get index
        System.out.println("last index result:"+names.lastIndexOf(20));

        // clear collection or empty collection
       // names.clear();

        //specific delete either by value or by index
        System.out.println( "delete operation by value :"+names.remove("ananta"));

        System.out.println( "delete operation by index :"+names.remove(3));

        // read by index
        System.out.println( "read operation by index :"+names.get(3));
        // traversal
        for(Object obj:names){
            System.out.println(obj);
        }


    }
}
