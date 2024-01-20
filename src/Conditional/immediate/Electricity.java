package Conditional.immediate;
import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units you consumed: ");
        int unit=sc.nextInt();
        System.out.println("Enter fix charges: ");
        float fix=sc.nextFloat();
        System.out.println("Enter Energy tax: ");
        float eTax=sc.nextFloat();
        float energy=eTax*unit;
        float cal=0;
        float x=2.5f;
        while (unit>0){
            if ( (unit/100)>0 ){
                unit=unit-100;
                cal=cal+100*x;
                System.out.println("if  "+cal);
                x=x+1;
            }else {
                cal=cal+unit*x;
                System.out.println("else "+cal);
                unit=unit-100;
            }
        }
        System.out.println("Total Electricity Bills: "+(fix+cal+energy));
    }
}
