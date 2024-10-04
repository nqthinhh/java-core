import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
        /*Escape character
        \ " -> "
        \ ' -> '
        \\ -> \
        \n -> xuống dòng
        \t -> tab
         */

        // System.out.print
        System.out.println("\"Java\" Core ");

        // System.out.println
        // System.out.printf
        // %d : Số thực
        // %s : String
        // %f : Số thực
        // %c : kí tự
        // %n : Xuống dòng

        String name = "Thịnh";
        int age = 22;
        System.out.printf("Tên của bạn là: %s, tuổi của bạn là:%d%n",name,age);
        //
        System.out.printf("| %8s | %n", "abc");
        System.out.printf("| %-8s | ", "abc");

        // Làm tròn số
        System.out.printf("Pi = %.3f%n", 3.1415);
        //Nhóm 3 số
        System.out.printf(Locale.CANADA, "Money = %,f%n", 123415000000.78);
        //In hoa :%S %C
    }
}
