package Loop;
import java.util.Scanner;

public class Loop32{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int p=0;
        System.out.println("Enter the start digit: ");
        int n=s.nextInt();

        for(int i=n;i>=1;i--) {
            p=p+i;
            System.out.println(i);

        }
        System.out.println("Sum of number from 1 to N: "+p);

    }
}
