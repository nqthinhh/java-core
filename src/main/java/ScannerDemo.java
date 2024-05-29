import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là :" + name );
        int age = scanner.nextInt();
        System.out.println("Tuổi của bạn là: " + age);
    }
}
