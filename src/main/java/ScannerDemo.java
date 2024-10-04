import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào tên của bạn:");
        String name = sc.nextLine();
        System.out.println("Tên của bạn là :" + name);

        System.out.println("Nhập vào tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.println("Tuổi của bạn là:" + age);

        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();

        System.out.println("Nhập vào số b:");
        int b = sc.nextInt();
        int max = a > b ? a : b;
        System.out.println("Số lớn hơn là " + max);
    }
}
