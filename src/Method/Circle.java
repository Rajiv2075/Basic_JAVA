package Method;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius=sc.nextInt();
        circum(radius);
        area(radius);
    }
    public  static  void  circum(int rad){
        int res=2*22*rad/7;
        System.out.println("Circumference is: "+res);
    }
    public static void  area(int rad){
        int res=22*rad*rad/7;
        System.out.println("Area of the circle: "+res);
    }
}
