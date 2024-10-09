import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String empty = "";
        String blank = "      ";
        String search = "    Samsung    ";
        String name = "Nguyễn Quang Thịnh";


        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("empty.isEmpty() = " + empty.isEmpty());
        System.out.println("blank.isEmpty() = " + blank.isEmpty());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        System.out.println("s.contains(\"Core\") = " + s.contains("Core"));
        System.out.println("search.trim() = " + search.trim());
        String[] words = name.split("");
        for (String word :
                words) {
            System.out.println("word = " + word);
        }

        System.out.println("s.substring(0,4) = " + s.substring(0, 4));

        // Bài tập
        // Bài 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên:");
        String s1 = sc.nextLine();
        String s2 = s1.substring(0,1).toUpperCase() + s1.substring(1).toLowerCase();
        System.out.println("s2 = " + s2);

        //Bài 2
        System.out.println("Mời bạn nhập vào tên: ");
        String s3 = sc.nextLine();
        String[] array = s3.split(" ");
        int count = 0;
        for (String word :
                array) {
          if (!word.isEmpty()){
              count++;
          }
        }
        System.out.println("Số từ " + count);
    }
}
