package FlowChart;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int c=1;
        while (c<11){
            System.out.println(num+"*"+c+"="+num*c);
            c++;
        }
    }
}
