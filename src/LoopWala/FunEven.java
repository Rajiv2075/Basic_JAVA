import java.util.Scanner;

public class FunEven {
    public static void even(int s){
        if (s%2==0){
            System.out.println("It is even number.");
        }else {
            System.out.println("It is odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int y=x.nextInt();
        even(y);
    }
}
