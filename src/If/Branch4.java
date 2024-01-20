package If;
import java.util.Scanner;

public class Branch4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        int n=s.nextInt();
        if (n%400==0||n%4==0&&n%100!=0){
            System.out.println(n+" is leap year .");
        }
    }
}
