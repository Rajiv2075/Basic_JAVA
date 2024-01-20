package Basic;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter currency in rupees: ");
        float curr=sc.nextFloat();
        float doller=curr/83.22f;
        System.out.println("In doller: "+doller);
    }
}
