package BinarySearch;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr={3,4,5,7,9,11,23,35};
        int ans=count(arr);
        System.out.println(ans);
    }

    public static int count(int []arr){
        int ans=findPivot(arr);
        return ans+1;
    }

    static int findPivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return -1;
    }
}
