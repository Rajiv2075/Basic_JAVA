package Volume;
import java.util.*;

public class VolCube {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter side of the cube: ");
        int a = s.nextInt();
        float c = a*a*a;
        System.out.println("volume  of cube= " + c);

    }
}
