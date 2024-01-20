package BinarySearch;

public class InfiniteSize {
    public static void main(String[] args) {
        int []arr={1,2,3,3,4,5,5,6,7,8,8,8,8,9,11,15,19};
        int target=3;
        int res=ans(arr,target);
        System.out.println(res);
    }

    static int ans(int []arr,int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return checkElements(arr,target,start,end);
    }

    static int checkElements(int []arr,int target,int start,int end){
           while (start<=end) {
               int mid = start + (end - start) / 2;
               if (target < arr[mid])
                   end = mid - 1;
               else if (target > arr[mid])
                   start = start + 1;
               else
                   return mid;
           }
           return -1;

    }
}
