package Area;

import java.util.*;

public class SurCube {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter side of the cube: ");
        int a = s.nextInt();
        float c = 4*a*a;
        System.out.println("Surface area  of cube= " + c);

    }
}
