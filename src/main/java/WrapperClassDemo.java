public class WrapperClassDemo {
    public static void main(String[] args) {
        //      WRAPPER CLASS
        // byte     -> Byte
        // short    -> Short
        // int      -> Integer
        // long     -> Long
        // float    -> Float
        // double   -> Double
        // boolean  -> Boolean
        // char     -> Char

        String s1 = new String("1");
        String s2 = new String("1");
        System.out.println(s1.equals(s2));

        // boxing : primitive -> wrapper class
        Integer integer = Integer.valueOf(100);

        // unboxing : wrap -> nguyên thủy
        int b = integer.intValue();

        // Bài toán : String -> number
        int c = Integer.parseInt("123");
        System.out.println("c = " + c);
    }
}
