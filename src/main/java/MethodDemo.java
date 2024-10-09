public class MethodDemo {
    public static void main(String[] args) {
        Math math = new Math();

        math.showPI();

        int max = math.max(1, 1000);
        System.out.println("max = " + max);

        int de = math.lode();
        System.out.println("de = " + de);
    }
}
