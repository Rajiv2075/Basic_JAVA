package Star;

public class Star28{
    public static void main(String[] args) {
        int n=5;

        for (int i=n;i>=1;i--){
            char a = 65;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){

                if (j==1||j==2*i-1||i==n) {
                    System.out.print(a + " ");
                }
                else {
                    System.out.print("  ");
                }
                a++;
            }
            System.out.println();
        }

        for (int i=2;i<=n;i++){
            char a = 65;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){

                if (j==1||j==2*i-1||i==n) {
                    System.out.print(a + " ");
                }
                else {
                    System.out.print("  ");
                }
                a++;
            }
            System.out.println();
        }
    }
}
