package BinarySearch2DArrays;

import java.util.Arrays;

public class SortedArraySearch {
    public static void main(String[] args) {
        int []arr[]={
                {10,20,30,40},
                {15,25,35,45},
                {20,41,60,80},
                {22,44,66,88},

        };
        System.out.println(Arrays.toString(search(arr,6)));
    }

    public static int[] search(int arr[][], int target){
        int r=0;
        int c=arr.length-1;
        while (r<arr.length&&c>=0){
            if(target==arr[r][c]){
                return new int[]{r,c};
            }else if(target>arr[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
