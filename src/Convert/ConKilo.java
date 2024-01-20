package Convert;
import java.util.*;
public class ConKilo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter kilometer: ");
        float k=s.nextFloat();
        float c=1000*k;
        System.out.println("Kilometer: "+k);
        System.out.println("In Meter: "+c);
    }
}