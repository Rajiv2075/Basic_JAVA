package Star;

public class Star27{
    public static void main(String[] args) {
        int n=6;

        for (int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                if (j==1||j==2*i-1||i==n)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                if (j==1||j==2*i-1||i==n)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
