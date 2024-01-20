package Loop;
import java.util.Scanner;

public class Loop33{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int p=0;
        System.out.println("Enter the last digit: ");
        int n=s.nextInt();

        for(int i=-5;i<=n;i++) {
            System.out.println(i);
            p=p+i;

        }
        System.out.println("Sum of number from -5 to N: "+p);

    }
}
