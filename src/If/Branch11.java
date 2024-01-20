package If;
import java.util.Scanner;

public class Branch11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter angle A : ");
        int a=s.nextInt();
        System.out.println("Enter angle B: ");
        int b=s.nextInt();
        System.out.println("Enter angle C: ");
        int c=s.nextInt();
        if ((a+b+c)==180){
            System.out.println("Triangle is Valid for these angles.");

        }

    }
}



