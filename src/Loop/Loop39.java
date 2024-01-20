package Loop;
import java.util.Scanner;

public class Loop39{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        long p=1;
        System.out.println("Enter the last digit: ");
        int n=s.nextInt();

        for(int i=n;i>=1;i--) {
            p=p*i;

        }
        System.out.println("Product of number from N to 1: "+p);

    }
}
