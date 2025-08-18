package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Integer[] values = {20,45,25};

        // creating new vector
        Vector<Integer> marks = new Vector();
        //inserting values into vector
        marks.add(200);
        marks.add(1, 450);
        marks.add(1, 220);
        // inserting an array to vector
        Collections.addAll(marks,values);

        // update
        marks.set(2,45);

        // remove by value
        marks.remove(Integer.valueOf(200));
        // remove by index
        marks.remove(3);
        // remove all
       // marks.clear();
        // check if vector is empty
        marks.isEmpty();

        // to get index of value
        marks.indexOf(Integer.valueOf(220));
        //traversal
        for (int i = 0; i < marks.size(); i++) {
            // read by index
            System.out.println(marks.get(i));
        }


        }
    }
