import java.util.Scanner;
class Even {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=s.nextInt();
        for (int i=0;i<n;i++){
            if(i%2==0)
            {
                System.out.println("Even number : "+i);
            }
        }

    }
}
