import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
        // Escape character
        // \" -> "
        // \' -> '
        // \t -> tab

        // System.out.print
        System.out.print("\"Java\" Core");
        // System.out.println mặc định xuống dòng

        // System.out.printf
        // %d: Số nguyên (byte, short, int, long)
        // %f: Số thực (float, double)
        // %s: String
        // %c: kí tự (char)
        // %n: Xuống dòng
        String name = "Khoa";
        int age = 30;
        System.out.printf("Tên của bạn là: %s, tuổi của bạn là: %d%n", name, age);
        // Căn lề
        System.out.printf("|  %8s  |", "abc");
         // Làm tròn số
        System.out.printf("PI = %.3f%n", 3.1415);
        // Nhóm 3 số
        System.out.printf("Money = %,f%n", 1231300000.59);
        System.out.printf(Locale.CANADA,"Money = %,f%n", 1231300000.59);
        System.out.printf(new Locale("vi"),"Money = %,f%n", 1231300000.59);
        // In hoa
        // %S, %C
        System.out.printf("Tên %S%n", "thinh");
    }
}
