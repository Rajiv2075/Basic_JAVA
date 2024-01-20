package Method;

import java.util.Map;
import java.util.Scanner;

public class Pythagorus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        triplet(a,b,c);
    }
    public static void triplet(int a, int b, int c){
        if(b<c){
            int temp=b;
            b=c;
            c=temp;
        }
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        if((a*a)==((b*b)+(c*c)))
            System.out.println("It is a triplet.");
        else
            System.out.println("It is not a triplet.");
    }
}
