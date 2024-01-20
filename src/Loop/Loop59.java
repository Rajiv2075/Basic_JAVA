package Loop;
import java.util.Scanner;

public class Loop59{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int c=0;
        System.out.println("Enter the number that you want to find the factor: ");
        int n=s.nextInt();

        System.out.println("Factor of "+n+" is: ");
        for(int i=1;i<n;i++) {
            if (n%i==0){
                System.out.println(i);
                c=c+i;
            }
        }

        if (n==c){
            System.out.println("\nIt is a Perfect number.");
        }else{
            System.out.println("\nIt is not a Perfect number.");
        }

    }
}
