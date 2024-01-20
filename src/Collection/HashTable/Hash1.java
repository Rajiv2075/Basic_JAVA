package Collection.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash1 {
    public static void main(String[] args) {

        //declare
        Hashtable t = new Hashtable<>();
        Hashtable t11 = new Hashtable<>(25);
        Hashtable t3 = new Hashtable<>(30, 0.99f);
        Hashtable<Integer, String> h1 = new Hashtable<>();

        //add
        h1.put(101, "Rajiv");
        h1.put(201, "mohit");
        h1.put(301, "Ramu");
        h1.put(501, "sunny");
        h1.put(401, "Ranvir");
        h1.put(210,"Raj");
        System.out.println(h1);

        //retrieve
        System.out.println(h1.get(301));

        //remove
        System.out.println(h1.remove(101));
        System.out.println(h1);

        //contains methods
        System.out.println(h1.containsKey(101));
        System.out.println(h1.containsValue("Ramu"));

        //isEmpty
        System.out.println(h1.isEmpty());

        //keyset
        System.out.println(h1.keySet());
        System.out.println(h1.values());

        //access value one by one
        for (int k:h1.keySet()){
            System.out.println(k+"      "+h1.get(k));
        }

        //Entry specific method we use
        for(Map.Entry entry: h1.entrySet()){
            System.out.println(entry.getKey()+"     "+entry.getValue());

        }
        //iterator
        Set s=h1.entrySet();
        Iterator it=s.iterator();
        while (it.hasNext()){
          //  System.out.println(it.next());

            Map.Entry entry=(Map.Entry) it.next();
            System.out.println(entry.getKey()+"   &    "+entry.getValue());

        }






    }
}
