package IfElseIf;
import java.util.*;

public class Branchs6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Cost Price: ");
        float cp= s.nextFloat();
        System.out.println("Enter the Selling Price: ");
        float sp=s.nextFloat();
        float c=sp-cp;
        if(c>0){
            System.out.println("Profit "+c);
        } else if (c<0) {
            c=c*(-1);
            System.out.println("Loss  "+c);
        }else {
            System.out.println("Not profit nor loss");
        }
    }
}

