package Loop;
import java.util.Scanner;

public class Loop25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter last number: ");
        int n=s.nextInt();

        for(int i=-5;i<=n;i++){
            System.out.println(i);
        }

    }
}
