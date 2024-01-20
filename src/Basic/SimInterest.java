package Basic;
import java.util.*;

public class SimInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int p=s.nextInt();
        System.out.println("Enter the Interest Rate: ");
       float r=s.nextFloat();
        System.out.println("Enter the time in years: ");
        float t=s.nextFloat();
        float sim =p*r*t/100;
        System.out.println("Principle Amount: "+p);
        System.out.println("Interest Rate: "+r);
        System.out.println("Time in Year: "+t);
        System.out.println("Simple interest: "+sim);



    }
}
