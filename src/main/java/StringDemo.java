public class StringDemo {
    public static void main(String[] args) {
        // Primitive
        String s1 = "Java Core";
        String s2 = "Java Core";

        // Non primitive
        String s3 = new String("Java Core");
        String s4 = new String("Java Core");

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s2);
    }
}
