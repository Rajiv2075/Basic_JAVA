package Loop;
import java.util.Scanner;

public class Loop45{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int c=0;
        System.out.println("Enter the last digit: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++) {
            if (i%2==0){
                c++;

            }
        }
        System.out.println("Count  of Even  number from 1 to N is: "+c);

    }
}
