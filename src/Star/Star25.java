package Star;

public class Star25{
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n;j++){
                if((i+j)==n+1||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j=2;j<=i;j++){
                if (i==j||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
