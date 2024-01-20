public class Hello {
    public static void main(String[] args) {
        String s5=new String();
        s5="Hello";
        System.out.println("VAlue : "+s5);
        String s1=new String("Hello");
        System.out.println("first String = "+s1);
        String s2=new String(s1);
        System.out.println("2nd String = "+s2);

        String s3="Nice Day";
        System.out.println("3rd String = "+s3);
        System.out.println("3rd String = "+s3.hashCode());



    }
}
