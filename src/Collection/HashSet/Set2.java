package Collection.HashSet;

import java.util.HashSet;

public class Set2 {
    public static void main(String[] args) {

        HashSet<Integer> even=new HashSet<>();
        even.add(232);
        even.add(236);
        even.add(33);
        even.add(27);
        even.add(23);
        System.out.println(even);

        HashSet<Integer> h1=new HashSet<>();
   //     System.out.println(h1);
        h1.addAll(even);
        h1.add(20);
        System.out.println("Add all: "+h1);

        //removeAll
      //  h1.removeAll(h1);
        h1.removeAll(even);
        System.out.println("After removing: "+h1);

    }
}
