package Convert;

import java.util.Scanner;

public class ConFarenToCel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Temperature in Farenheit: ");
        float f=s.nextFloat();
        float c=(f-32)*(float) 5/9;
        System.out.println("Temperature in Farenheit: "+f);
        System.out.println("Temperature in Celcius: "+c);

    }
}


//  °F = °C × (9/5) + 32