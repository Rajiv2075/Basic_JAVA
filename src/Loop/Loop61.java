package Loop;
import java.util.Scanner;

public class Loop61{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int c=0;
        int p=0;
        System.out.println("Enter the number that you want to find the factor: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++) {
            if (n%i==0){
                if(i%2==0){
                    c=c+i;
                }else{
                    p=p+i;
                }
            }
        }
        System.out.println("Sum of Even factor is: "+c);
        System.out.println("Sum of Odd factor is: "+p);
        System.out.println("Difference between even factor and odd factor is: "+(c-p));
    }
}
