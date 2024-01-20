package Convert;
import java.util.Scanner;

public class ConCelToFaren {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celcius: ");
        float c=s.nextFloat();
        float f=(c*((float)9/5))+32;
        System.out.println("Temperature in Celcius: "+c);
        System.out.println("Temperature in Farenheit: "+f);

    }
}


//  °F = °C × (9/5) + 32