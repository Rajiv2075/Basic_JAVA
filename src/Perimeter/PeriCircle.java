package Perimeter;
import java.util.*;

public class PeriCircle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        int  r=s.nextInt();
        float c=3.14f*(float) r*2;
        System.out.println("Perimeter of circle= "+c);
    }
}
