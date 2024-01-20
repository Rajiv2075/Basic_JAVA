package Area;

import java.util.Scanner;

public class SurCylin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius of cylinder: ");
        int r = s.nextInt();
        System.out.println("Enter the height of cylinder: ");
        int  h=s.nextInt();
        float c =2*(float)22/7*(float) r*h;
        float d =2*(float)22/7*(float) r*r;
        float m=c+d;
        System.out.println("Surface Area  of cylinder=  " +m);

    }
}


