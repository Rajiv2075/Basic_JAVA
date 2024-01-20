package Collection.ArrayList;

import java.util.*;

public class List1 {
    public static void main(String[] args) {

        //declare
        ArrayList a1=new ArrayList();
        ArrayList  <Integer> a2=new ArrayList<>();
        ArrayList <String> a3=new ArrayList<String>();
        List a4=new ArrayList();

        //add new elements
        a1.add(100);
        a1.add("Rajiv");
        a1.add(0.9);
        a1.add('a');
        a1.add(true);

        System.out.println(a1);

        //size
        System.out.println("No of element: "+a1.size());

        //remove
        Object remove=100;
        a1.remove(remove);
        a1.remove(2);
        System.out.println(a1);

        //add using index
        a1.add(2,"python");
        System.out.println(a1);

        //retreive
        System.out.println(a1.get(2));

        //change element
        a1.set(2,"java");
        System.out.println(a1.get(2));

        //search
        System.out.println(a1.contains("jva"));

        //empty
        System.out.println("empty: "+a1.isEmpty());
      //  a1.removeAll(a1);
        System.out.println(a1);

        //for loop
        System.out.println("Reading elements using for loop: ");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }

        //for each loop
        System.out.println("Reading elements using foreach loop: ");
        for (Object e:a1){
            System.out.println(e);
        }

        //iterator
        System.out.println("Reading elements using Iterator ");
        Iterator  it=a1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
