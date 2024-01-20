package Convert;
import java.util.*;
public class ConMeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter meter: ");
        float m=s.nextFloat();
        float c=m/1000;

        System.out.println(" Meter: "+m);
        System.out.println("In Kilometer: "+c);
    }
}