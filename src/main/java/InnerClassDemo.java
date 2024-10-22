public class InnerClassDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Thinh");
        Student.Gender gender = student.new Gender("male");
        gender.showInfo();
    }
}
