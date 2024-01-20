package Loop;
import java.util.Scanner;

public class Loop36{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int p=0;
        System.out.println("Enter the last digit: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++) {
            if (i%2==0){
                p=p+i;
                System.out.println(i);

            }
        }
        System.out.println("Sum of Even  number from 1 to N: "+p);

    }
}
