package Array;

import java.util.Arrays;
import java.util.Collections;

public class kthLargest {
    public static void main(String[] args) {
        int [] arr={1000000003,1000000003,1000000007,2,9,3};
        int n=arr.length;
        int k=3;
        int[] ans=productPuzzle(arr,n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productPuzzle(int[] arr, int n) {
        // Write your code here.
        int[] res=new int[n];
        long total=product(arr,n);
        for (int i = 0; i <n ; i++) {
            res[i]=(int)(total/arr[i]);
        }
        
        return res;
    }

    static long product(int[] arr,int n){
        long pro=1;
        int mod=1000000007;
        for (int i = 0; i < n; i++) {
            pro=(pro%mod*arr[i])%mod;
        }
        return pro;
    }
}
