public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói
        // 1. Thêm private cho all thuộc tính
        // 2. Truy cập thông qua getter / setter

        Student student = new Student("Thinh");
        System.out.println("student.getName() = " + student.getName());
        student.setName("Minh");
        System.out.println("student.getName() = " + student.getName());
    }
}
