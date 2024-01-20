package Area;

import java.util.*;

public class TolSurCube {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter side of the cube: ");
       float a = s.nextInt();
        float c = 6*a*a;
        System.out.println("Total Surface Area  of cube= " + c);

    }
}
