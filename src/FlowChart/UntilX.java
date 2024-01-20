package FlowChart;

import java.util.Scanner;

public class UntilX {
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
        char ch;
        do {

            System.out.println("Enter two number: ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int sum=num1+num2;
            System.out.println("Sum: "+sum);
            System.out.println("Enter other key to continue Or enter x to exit: ");
             ch=sc.next().charAt(0);
        }while (ch!='x'&&ch!='X');


    }
}
