package BinarySearch;

import java.util.ArrayList;

public class FirstAndLastIndexFind {
    public static void main(String[] args) {
        int [] arr={1,2,4,4,4,5,6,7};
        int target=4;
//        int []ans=check(arr,target);
//        System.out.println(Arrays.toString(ans));

        int a=first(arr,target);
        System.out.println(a);
        int b=last(arr,target);
        System.out.println(b);


    }
    static  int[] check(int []arr,int target){
        int x=-1,y=-1;
        int end=arr.length-1;
        for(int start=0;start<arr.length;start++){
            if(arr[start]==target)
                x=start;
            if(arr[end-start]==target)
                y=end-start;
        }
        return (new int[]{y,x});
    }

    static int first(int []arr,int target){
        int x=-1;
        int start=0,end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                x=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end = end-1;
            }else{
                start=mid+1;
            }
        }
        return x;
    }

    static int  last(int []arr,int target){
        int start=0,end=arr.length-1;
        int y=-1;
        ArrayList x=new ArrayList<>();
        x.get(1);
        System.out.println();
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                y=mid;
                start =mid+1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return y;
    }
}
