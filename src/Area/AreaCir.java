package Area;

import java.util.*;

public class AreaCir {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
       int  r=s.nextInt();
       float c=(float)22/7* r* r;
        System.out.println("Area of circle= "+c);
    }
}
