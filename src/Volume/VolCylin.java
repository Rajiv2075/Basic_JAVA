package Volume;
import java.util.Scanner;

public class VolCylin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius of cylinder: ");
        int r = s.nextInt();
        System.out.println("Enter the height of cylinder: ");
        int  h=s.nextInt();
        float c =(float) r*r*22/7*h;
        System.out.println("Volume of cylinder=  " + c);

    }
}
