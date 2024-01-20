package Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {

        //declare
        HashSet h1=new HashSet<>();
        HashSet h2=new HashSet(30);
        HashSet h3=new HashSet<>(30,0.95f);
        HashSet <Integer> h4=new HashSet<Integer>();

        //add elements
        h1.add(45);
        h1.add("Hello");
        h1.add(true);
        h1.add(null);
        h1.add('a');
        System.out.println(h1);

        //remove
        h1.remove(45);
        System.out.println("After removing");
        System.out.println(h1);

        //searching
        System.out.println(h1.contains("hello"));

        //empty or not
        System.out.println("After empty checking");
        System.out.println(h1.isEmpty());

        //reading obj hashset using foreach loop
        System.out.println("Using for each loop");
        for (Object x:h1
             ) {
            System.out.println(x);
        }

        //Iterator class using
        System.out.println("Using iterator method: ");
        Iterator it=h1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
