package Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Link2 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList<>();

        l1.add("x");
        l1.add("j");
        l1.add("a");
        l1.add("g");
        l1.add("c");

        LinkedList<String> l2=new LinkedList<>();

        //add All method
        l2.addAll(l1);
        System.out.println(l2);

        //removeAll
//        l2.removeAll(l2);
//        System.out.println(l2);

        //sorting
        Collections.sort(l2);
        System.out.println(l2);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);

        //shuffle
        Collections.shuffle(l2);
        System.out.println(l2);
    }
}
