package Area;

import java.util.*;

public class AreaRect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        int l=s.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        int h=s.nextInt();
        int c=l*h;
        System.out.println("Area of Rectangle= "+c);
    }
}
