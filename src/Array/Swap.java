package Array;

import java.util.Arrays;
//import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
     //   Scanner sc=new Scanner(System.in);
        int []arr={2,5,1,6,43,2,6,4};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
        int max1=max(arr,0,3);
        System.out.println("Maximum element: "+max1);
        int min1= min(arr,0,6);
        System.out.println("Minimum Element: "+min1);
        System.out.println("finding reverse number: ");
        reverse(arr);
        System.out.println("Reverse arrays: "+Arrays.toString(arr));

    }

    public static void swap(int []arr,int start,int end){
        int temp;
        if(start>end){
            return;
        }
        if(arr==null){
            return;
        }
        temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static int max(int []arr,int start,int end){
        if(start>end){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int large=arr[0];
        for (int i = start; i <=end ; i++) {
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
    }

    public static int min(int []arr,int start,int end){
        if(start>end){
            return -1;
        }if(arr==null){
            return -1;
        }
        int small=arr[0];
        for (int i = start; i <=end ; i++) {
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }

    public static void  reverse(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
}
