package LinearSearch;

public class SearchElement {
    public static void main(String[] args) {
        int []arr={2,3,4,65,7,45,9,323,6};
        int target=6335;
        int index=search(arr,target);
        System.out.println("index where elements found: "+index);
        boolean index1=search1(arr,target);
        System.out.println(index1);
        System.out.println("Search Range: ");
        boolean check=searchRange(arr,45,2,6);
        System.out.println(check);
    }
    public static int search(int []arr,int target){
        if(arr==null){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static boolean search1(int[] arr, int target){
        if(arr==null){
            return false;
        }
        for (int j : arr) {
            if (target == j) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchRange(int[] arr, int target,int start,int end){
        if(arr==null){
            return false;
        }
       for(int i=start;i<=end;i++)
       {
           if(arr[i]==target){
               return true;
           }
       }
        return false;
    }
}
