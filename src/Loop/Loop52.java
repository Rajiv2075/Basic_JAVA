package Loop;
import java.util.Scanner;

public class Loop52{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int c=0;
        System.out.println("Enter the number that you want to find the factor: ");
        int n=s.nextInt();

        System.out.println("Odd Factor of "+n+" is: ");
        for(int i=1;i<=n;i++) {
            if (n%i==0&&i%2==1){
                System.out.print(" "+i);
                c=c+i;
            }
        }
        System.out.println("\nSum of Odd factor is: "+c);

    }
}
