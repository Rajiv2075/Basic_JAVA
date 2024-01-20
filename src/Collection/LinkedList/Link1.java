package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Link1 {
    public static void main(String[] args) {

        //Declare
        LinkedList l1=new LinkedList();
        LinkedList <Integer> l2=new LinkedList<Integer>();

        //add elements
        l1.add(100);
        l1.add("Helo");
        l1.add('a');
        l1.add(true);
        l1.add(null);

        System.out.println(l1);


        //size
        System.out.println(l1.size());

        //remove
        l1.remove(3);
        System.out.println(l1);
//        l1.removeAll(l1);
//        System.out.println( l1);

        //first add
        l1.addFirst(34);
        System.out.println(l1);

        //middle insert
        l1.add(2,"java");
        System.out.println(l1);

        //reteriveing
        System.out.println(l1.get(2));

        //set method
        l1.set(5,"Chalo");
        System.out.println(l1.get(5));

        //searching
        System.out.println(l1.contains("jva"));

        //checking empty or not
        System.out.println(l1.isEmpty());

        //reading objects through for loop
        System.out.println("Through for loop");
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        //reading objects through foreach loop
        System.out.println("From for each loop");
        for (Object x:l1
             ) {
            System.out.println(x);
        }

        //iterator method
        System.out.println("Through iterator method");
        Iterator it=l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
