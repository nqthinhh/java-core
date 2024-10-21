import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list= new LinkedList<String>();
        // var list = new LinkedList<String>();

        // Thêm phần tử vào cuối
        list.add("Bo");
        list.add("Contrau");

        // Thêm vào vị trí bất kì
        list.add(1,"Con meow");

        // Kích thước
        System.out.println("list.size() = " + list.size());

        // Kiểm tra chứa phần tử
        System.out.println("list.contains(\"Bo\") = " + list.contains("Bo"));

        // Lấy ra chỉ số
        System.out.println("list.indexOf(\"Contrau\") = " + list.indexOf("Contrau"));

        //  Xóa toàn bộ
        list.clear();
    }
}
