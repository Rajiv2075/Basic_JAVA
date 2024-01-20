package BinarySearch;

public class LargeChar {
    public static void main(String[] args) {
        char [] ch={'c','f','j'};
        char target='j';
        char ans=nextGreatestLetter(ch,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
//        char x=letters[0];
//        if(target>letters[letters.length-1]){
//            return letters[0];
//        }
//       int start=0;
//       int end=letters.length-1;
//
//       while(start<=end){
//           int mid=start+(end-start)/2;
//           if(letters[mid]>target){
//               x=letters[mid];
//               end=mid-1;
//           }else{
//               start=mid+1;
//           }
//       }
//       return x;



        if(target>letters[letters.length-1]){
            return letters[0];
        }
        int start=0,end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%(letters.length)];
    }
}
