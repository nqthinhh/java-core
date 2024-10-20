public class StaticDemo {
    public static void main(String[] args) {
        Student student = new Student("Thinh", 19);
        Student student1 = new Student("Khoa", 28);

        student.count = 10;
        System.out.println("student1 = " + student1);
        System.out.println("student1.count = " + student1.count);

        // Truy cập thông qua tên class
        System.out.println("Student.count = " + Student.count);

        int max = Student.max(10,100);
        System.out.println("max = " + max);

        // Static không thể truy cập non-static

    }
}
