package String;

public class String6 {
    public static void main(String[] args) {
        String s1=new String("hello");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        s1="nice";
        System.out.println(s1);
        System.out.println(s1.hashCode());

    }
}
