package Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial and final range: ");
        int ini=sc.nextInt();
        int fin=sc.nextInt();
        for(int i=ini;i<=fin;i++){
            int x=i;
            int sum=0;
            while (x>0){
                int rem=x%10;
                sum =sum+(rem*rem*rem);
                x /=10;
            }
            if(i==sum)
                System.out.println(sum);
        }

    }
}
