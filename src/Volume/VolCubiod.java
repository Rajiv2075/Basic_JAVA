package Volume;
import java.util.*;

public class VolCubiod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of the cuboid: ");
        int l=s.nextInt();
        System.out.println("Enter breadth of the cuboid: ");
        int b=s.nextInt();
        System.out.println("Enter height of the cuboid: ");
        int h=s.nextInt();
        int c=l*b*h;
        System.out.println("Volume of the cuboid: "+c);

    }

}
