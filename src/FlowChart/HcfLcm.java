package FlowChart;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if ( num1 < num2 ) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int lcm=0;
        for(int c=num1;c<=num1*num2;c++)
            if ( c % num1 == 0 & c % num2 == 0 ) {
                lcm = c;
                break;
            }
        int hcf=num1*num2/lcm;
        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);

    }
}
