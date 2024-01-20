package Volume;
import java.util.*;

public class VolCone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius of cone: ");
        int r = s.nextInt();
        System.out.println("Enter the height of cone: ");
        int  h=s.nextInt();
        float c =((float) r*r*(float)22/7*h)/3;
        System.out.println("Volume of cone=  " + c);

    }
}
