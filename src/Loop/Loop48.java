package Loop;
import java.util.Scanner;

public class Loop48{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);


        System.out.println("Enter the number that you want to find the factor: ");
        int n=s.nextInt();

        System.out.println("Even Factor of "+n+" is: ");
        for(int i=1;i<=n;i++) {
            if (n%i==0&&i%2==0){
                System.out.print(" "+i);
            }
        }

    }
}
