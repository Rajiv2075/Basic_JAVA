package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int [] arr={992,883,774,665,556,412,313,224,136,46};
        int [] ar={1,2,3,4,5,6,8,11,25,36,49};
        int target=11;
        int ans=order(ar,target);
        System.out.println(ans);
    }
    static int order(int []arr,int target){
        int start=0;
        int x=-1;
        int end=arr.length-1;
        boolean check=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(check){
                if(target<arr[mid])
                    end=end-1;
                else
                    start=mid+1;
            }else {
                if(target<arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }

        return -1;
    }
}
