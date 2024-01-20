package Problem;

import java.util.Arrays;

public class Hello {
  public   static String uppercaseORLowercase(int n, String s) {
        // Write your code here.
        int x=s.length();
        int count=0;
        for(int i=0;i<x;i++){
            if(s.trim().charAt(i)>96&&s.trim().charAt(i)<123){
                count++;
            }
        }
      System.out.println(count);

      if(count==n/2){
          s=s.toLowerCase();
      }else if(count>n/2){
          s=s.toLowerCase();
      }else{
          s=s.toUpperCase();
      }
      return s;
    }

    public static void main(String[] args) {
        String h=uppercaseORLowercase(5,"hLL");
        System.out.println(h);
    }
}