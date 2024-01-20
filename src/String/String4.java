package String;

public class String4 {
    public static void main(String[] args) {
        char []x={'h','e','l','l','o'};
        String s1=new String(x);
        System.out.println("The content of x");
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]);
        }
        System.out.println("\nValue of s1: "+s1);
        System.out.println(x.hashCode());
    }
}
