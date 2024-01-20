package Perimeter;
import java.util.*;

public class PeriRect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        int l=s.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        int h=s.nextInt();
        int c=2*(l+h);
        System.out.println("Perimeter of Rectangle= "+c);
    }
}
