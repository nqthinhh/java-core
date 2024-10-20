package backend;

import entity.Student;

public class Exercise01 {


        public static void question01 () {
            Student s1 = new Student(1, "Nguyen Quang Thinh");
            Student s2 = new Student(2, "Nguyen Quang b");
            Student s3 = new Student(3, "Nguyen Quang c");

            Student[] students = {s1, s2, s3};

            Student.college = "Đại học Uneti";
            for (Student student : students) {
                System.out.println("student.college = " + student.college);
            }
        }

}
