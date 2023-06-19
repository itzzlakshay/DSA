package queue;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        System.out.println(q);
//        q.remove();
////        q.poll(); // used to remove element
//        System.out.println(q);
//        System.out.println(q.peek());
////        System.out.println(q.element()); // used to indicate element on top of queue
//        System.out.println(q.size());

        Queue<Integer> helper = new LinkedList<>();

        while(q.size()>0){
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        while(helper.size()>0){
            q.add(helper.remove());
        }


    }
}
