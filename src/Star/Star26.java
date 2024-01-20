package Star;

public class Star26{
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n;j++){
                if((i+j)==n+1||i==n)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }

            for (int j=2;j<=i;j++){
                if (i==j||i==n)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i=2;i<=n;i++){
            for (int j=1;j<=n;j++){
                if((i+j)==n+1||i==n)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }

            for (int j=2;j<=i;j++){
                if (i==j||i==n)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
