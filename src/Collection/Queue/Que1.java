package Collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Que1 {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue<>();
        q.add("A");
        q.add("C");
        q.add("B");
        q.offer("A");
        System.out.println(q);  // [A, A, B, C]

        //get head elements
//        System.out.println(q.element());
//        System.out.println(q.peek());

 //       q.removeAll(q);
 //       System.out.println(q.element());
//        System.out.println(q.peek());

        //remove and return head

    //    System.out.println(q.remove());
//        System.out.println(q.poll());

        //through iterator
        System.out.println("Through iterator");
        Iterator it=q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
          //  foreach loop
            System.out.println("Foreach loop");
            for (Object x:q
                 ) {
                System.out.println(x);
            }

    }
}
