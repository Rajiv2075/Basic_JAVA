package Loop;
import java.util.Scanner;

public class Loop38{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        long p=1;
        System.out.println("Enter the last digit: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++) {
            p=p*i;

        }
        System.out.println("Product of number from 1 to N: "+p);

    }
}
