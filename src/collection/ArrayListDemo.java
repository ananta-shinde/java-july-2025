package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList();
        // insert
        fruits.add("mango");
        fruits.add(0,"banana");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("pineapple");

        // delete
        fruits.remove(0);

        // traversal
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        System.out.println("**********************");
        // traversal using iterator
        Iterator itr =fruits.iterator();
       while (itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
