package Area;

import java.util.*;

public class SurCone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius of cone: ");
        double r = s.nextDouble();
        System.out.println("Enter the height of cone: ");
        float h=s.nextFloat();
       double c=22/7*r*(r+Math.sqrt(h*h+r*r));
        System.out.println("Surface Area of cone=  " + c);

    }
}


//       A=πr(r+sqrt(h2+r2))