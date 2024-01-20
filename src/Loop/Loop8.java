package Loop;
import java.util.Scanner;

public class Loop8{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Odd number from 1 to 30: ");
        for(int i=1;i<=30;i++) {
            if (i % 2 == 1) {


                System.out.println(i);
            }
        }

    }
}
