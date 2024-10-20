public class FinalDemo {
    public static void main(String[] args) {

        // Biến final : final variable : final property
        // Tạo hằng số :
        final double PI = 3.14159;

        // Phương thức final : final method
        // Lớp con không thể ghi đè final method của lớp cha
        Dog dog = new Dog();
        dog.eat();
        // final class
        // không có class con

    }
}
