package Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class Map1 {
    public static void main(String[] args) {

        //declare
       // HashMap m=new HashMap<>();
        HashMap <Integer,Integer> m=new HashMap<>();

        //add
        m.put(1,0);
        m.put(2,1);
        m.put(2,2);
        System.out.println( m.containsKey(2));
        System.out.println(m.get(2));


        System.out.println(m);

        System.out.println("Map details: "+m);
        //get
//        System.out.println("VAlue of key 101: "+m.get(101));
//
//        //remove
//        System.out.println("Removing at 101: "+m.remove(101));
//        System.out.println(m);
//
//        //contain or check value is preesent or not
//        System.out.println(m.containsKey(202));
//        System.out.println(m.containsValue("Rja"));
//
//        System.out.println(m.isEmpty());
//
//        System.out.println(m.keySet());
//        System.out.println(m.values());
//
//        System.out.println(m.entrySet());
// only for value
      /*  for (Object x:m.values()
             ) {
            System.out.println(x);
        }
        //only key value
        for (Object x:m.keySet()
        ) {
            System.out.println(x);
        }
        for (Object i:m.keySet()
        ) {
            System.out.println(i+"     "+m.get(i));
        }

        //entry methods
        System.out.println("using entry methods");
        for (Map.Entry entry:m.entrySet()) {
            System.out.println(entry.getKey()+"      "+entry.getValue());
        }


       */

        //using iterator methods
//        Set s=m.entrySet();
//        Iterator it=s.iterator();
//        while(it.hasNext()){
//            Map.Entry entry=(Map.Entry)it.next();
//            System.out.println(entry.getKey()+"     "+entry.getValue());
//        }
   }
}
