package String;

public class String5 {
    public static void main(String[] args) {
        byte []x={65,66,67,68,69};
        System.out.println("The array of byte: ");
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);
        }
        String s1=new String(x);
        System.out.println("The String = "+s1);
    }
}
