import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        //
        int a = random.nextInt();
        System.out.println("a = " + a);

        // random từ 0 -100
        int b = random.nextInt(100);
        System.out.println("b = " + b);

        // min <= x <= max
        int c = random.nextInt(10,1000);
        System.out.println("c = " + c);

        // Random một phần tử trong mảng
        String[] fruits = {"Cam", "Táo", "Ổi", "Lê"};
        int index = random.nextInt(fruits.length);
        String fruit = fruits[index];
        System.out.println("fruit = " + fruit);
    }
}
