package Collection.Queue;

import java.util.LinkedList;

public class Que2 {
    public static void main(String[] args) {
        LinkedList q=new LinkedList<>();
        q.add("A");
        q.add("B");
        q.add("B");
        q.offer(100);
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.poll());
        System.out.println(q);

        q.removeAll(q);
        //System.out.println(q.remove());
        System.out.println(q.poll());
    }
}
