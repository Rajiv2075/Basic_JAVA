package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class List2 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("X");
        a1.add("A");
        a1.add("C");
        a1.add("B");
        a1.add("N");
        a1.add("B");

        ArrayList a2=new ArrayList();
        a2.addAll(a1);
        System.out.println(a1);
        System.out.println(a2);

        a2.removeAll(a2);
        System.out.println(a2);

        //sort
        Collections.sort(a1);
        System.out.println(a1);

        Collections.sort(a1,Collections.reverseOrder());
        System.out.println(a1);

        //shuffle
        Collections.shuffle(a1);
        System.out.println(a1);


    }
}
