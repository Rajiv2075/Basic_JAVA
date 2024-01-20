package Area;

import java.util.*;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter side of the square: ");
        int a = s.nextInt();
        float c = a * a;
        System.out.println("Area of square= " + c);

    }
}
