package Loop;
import java.util.Scanner;

public class Loop56{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int c=0;
        System.out.println("Enter the number that you want to find the factor: ");
        int n=s.nextInt();

        System.out.println("Factor of "+n+" is: ");
        for(int i=1;i<=n;i++) {
            if (n%i==0){
                System.out.print(" "+i);
                c++;
            }
        }
        System.out.println("\nCount of all the factor is: "+c);

    }
}
