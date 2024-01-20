package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int []arr={1,2,3,8,9};
        int target=7;
        int ans=check2(arr,target);
        System.out.println(ans);
    }
    public static int check2(int []arr,int target){
        int start=0,end=arr.length-1;
        int x=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=target){
                x=arr[mid];
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        // return x;      // approach 1 and below approach 2
        if(arr[start-1]==target)
            System.out.println("Start"+arr[start-1]);
        else
            System.out.println("Start "+arr[start]);
        return arr[end];
    }
}
