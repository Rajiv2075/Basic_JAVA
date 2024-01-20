package Basic;

import java.util.*;
public class TotalAndAver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        System.out.println("Enter the third number: ");
        int c = s.nextInt();
        System.out.println("Enter the fourth number: ");
        int d = s.nextInt();
        System.out.println("Enter the fifth number: ");
        int e = s.nextInt();
        int total=a+b+c+d+e;
        float aver=(float)total /5;
        System.out.println("first number= "+a);
        System.out.println("second number= "+b);
        System.out.println("third number= "+c);
        System.out.println("fourth number= "+d);
        System.out.println("fifth number= "+e);
        System.out.println("Total of five number: "+total);
        System.out.println("Average of five number: "+aver);

    }
}
