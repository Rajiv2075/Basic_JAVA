package Loop;
import java.util.Scanner;

public class Loop28{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the last digit: ");
        int n=s.nextInt();

        System.out.println("All even type number from 1 to n: ");
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
