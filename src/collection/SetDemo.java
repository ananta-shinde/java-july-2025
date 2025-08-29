package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet myset = new HashSet();
//        Set anotherSet = new TreeSet();
//


        // insert
        myset.add(20);
        myset.add(56);
        myset.add(20);

        myset.remove(56);

        System.out.println("size :"+ myset.size());

        //traversal
        Iterator itr = myset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
