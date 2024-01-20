package Others;

public class DefaultValue {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("rajiv kumar");
        System.out.println("string1: " + sb);
        // deleting the substring from index 2 to 6
        sb.delete(2, 6);
        System.out.println("After deleting: " + sb);
    }
}

