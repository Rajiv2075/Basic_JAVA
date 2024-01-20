package Conditional.immediate;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of the object: ");
        int num=sc.nextInt();
        System.out.println("Enter the object you choice: ");
        int r= sc.nextInt();
        int nFact=1,rFact=1,dFact=1;
        for(int i=1;i<=num;i++){
            nFact=nFact*i;
            if(i<=r){
                rFact=rFact*i;
            }
            if((num-r)>=i){
                dFact=dFact*i;
            }
        }
        int result=nFact/(rFact*dFact);
        System.out.println("Combination Result: "+result);

        int result1=nFact/dFact;
        System.out.println("Permutation result: "+result1);
    }
}
