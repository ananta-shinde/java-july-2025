package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque();
        // insert
        q.offer(10);
        q.offer(20);
//        q.poll();
        System.out.println(q.peek());
    }
}
