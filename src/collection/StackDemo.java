package collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack mystack = new Stack();
        mystack.push("first");
        mystack.push("second");
        mystack.push("third");
        System.out.println("deleted element :" +mystack.pop());
        System.out.println(mystack.peek());
        System.out.println("size : "+ mystack.size());
        System.out.println("searched : "+mystack.search("first"));

    }
}
