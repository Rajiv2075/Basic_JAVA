import java.util.Scanner;

public class Factorial {

    public static void factorials(int n){
        if (n<0){
            System.out.println("Factorial can't find for negative number...");

        } else if (n==0) {

            System.out.println("Factorial= "+1);
        }

        else {
            long fact=1;
            for(int i=n;i>=1;i--){
                fact=fact*i;

            }
            System.out.println("factorial = "+fact);
        }

    }


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=s.nextInt();

       factorials(n);

    }
}
