package Collection.LinkedList;

import java.util.LinkedList;

public class Link3 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList<>();
        l1.add("horse");
        l1.add("joy");
        l1.add("apple");
        l1.add("goal");
        l1.add("cat");
        System.out.println(l1);
        System.out.println(l1.size());

        //addFirst
        l1.addFirst("Tiger");
        l1.addLast("Elephant");
        System.out.println(l1);
        System.out.println(l1.size());

        //getFirst and getLast

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        //removeFirst and removeLast
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);

    }
}
