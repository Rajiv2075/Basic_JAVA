package Collection.HashSet;

import java.util.HashSet;

public class Set3 {
    public static void main(String[] args) {

        //union or intersection, difference
        HashSet <Integer>h1=new HashSet<>();
        h1.add(1);
        h1.add(8);
        h1.add(2);
        h1.add(4);
        h1.add(3);
        System.out.println("H1 elements: "+h1);

        HashSet <Integer>h2=new HashSet<>();
        h2.add(3);
        h2.add(4);
        h2.add(6);
        System.out.println("H2 elements: "+h2);

//        h1.removeAll(h1);
      //  union (unique elements we find through this)
//        h1.addAll(h2);
//        System.out.println("After union: "+h1);


     //   intersection(common elements find through two sets)
//        h1.retainAll(h2);
//        System.out.println("After intersection: "+h1);

      //  difference
//        h1.removeAll(h2);
//        System.out.println("Difference: "+h1);

        //subsets
        System.out.println( h1.containsAll(h2));
        System.out.println("Subset : "+h1);
    }
}
