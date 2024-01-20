package Star;

public class Star22 {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<=n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<i;k++){
               if(k==0||i==n)
                System.out.print("*");
           else
                   System.out.print(" ");
            }
            for (int s=1;s<i;s++){
                if(s==i-1||i==n)
                System.out.print("*");
            else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
