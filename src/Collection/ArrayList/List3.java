package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class List3 {
    public static void main(String[] args) {
        String []str={"Dog","cat","puppy"};

        // approach 1
//        ArrayList a1=new ArrayList();
//        for (String v:str
//             ) {
//            a1.add(v);
//        }
//        System.out.println(a1);

        //approach 2
        ArrayList a1=new ArrayList(Arrays.asList(str));
        System.out.println(a1);
    }
}
