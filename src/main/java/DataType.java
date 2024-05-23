public class DataType {
    public static void main(String[] args) {
        System.out.println("Đơn giản thôi");
        // Cú pháp khởi tạo biến
        // [kieu_du_lieu] [ten_bien] = [gia_tri_khoi_tao];

        // Kiểu số nguyên : byte(1), short(2), int(4), long (8)
        int age = 18;
        System.out.println("Tuổi" + age);

        // Kiểu số thực: float(4), double(8)
        float pi = 3.141592653589793f;
        double  Pi = 3.141592653589793;
        System.out.println("pi" + pi);
        System.out.println("Pi" + Pi);

        // Kiểu logic : boolean
        boolean isLoading = true;
        System.out.println(true);

        // Kiểu kí tự : char(2)
        char c = 'a';
        System.out.println(c);

        // Kiểu xâu kí tự: String
        String name = "Thịnh";
        System.out.println(name);

        // Kiểu enum

        // Class & Object
        Dog dog1 = new Dog();
        dog1.name = "Shiba";
        dog1.age = 2;
        dog1.bark();
        int sum = dog1.sum(1,10);
        System.out.println(sum);

    }
}
