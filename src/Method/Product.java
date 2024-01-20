package Method;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int res= product(a,b);
        System.out.println("Product of the number: "+res);
    }
    public  static int  product(int a, int b){
        return(a*b);
    }
}
