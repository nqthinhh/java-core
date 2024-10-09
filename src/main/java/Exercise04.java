import java.util.Scanner;

public class Exercise04 {
    void question04(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên: ");

        String name = sc.nextLine();
        int length = name.length();
        for (int i = 0; i < length; i++) {
            int n = i +1;
            int c = name.charAt(i);
            System.out.printf("Ký tự thứ %d là : %C%n", n, c);

        }
    }

    void question6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên: ");

        String s = sc.nextLine();
        int indexOF = s.indexOf(' ');
        int lastIndexOf = s.lastIndexOf(' ');
        String firstName = s.substring(0, indexOF);
        String lastName = s.substring(lastIndexOf + 1);
        String middleName = s.substring(indexOF +1 , lastIndexOf);
        System.out.println("Họ là " + firstName);
        System.out.println("Tên đệm là " + middleName);
        System.out.println("Tên là " + lastName);

    }
}
