public class OverloadingDemo {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int total = math.sum(1,2,4);
        System.out.println("total = " + total);

    }
}
