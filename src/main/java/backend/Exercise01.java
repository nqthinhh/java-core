package backend;

import entity.PrmaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class Exercise01 {


        public static void question01 () {
            Student s1 = new Student( "Nguyen Quang Thinh");
            Student s2 = new Student( "Nguyen Quang b");
            Student s3 = new Student ("Nguyen Quang c");

            Student[] students = {s1, s2, s3};

            Student.college = "Đại học Uneti";
            for (Student student : students) {
                System.out.println("student.college = " + student.college);
            }
        }

        public static void question06(){
            Student s1 = new PrmaryStudent("a");
            Student s2 = new PrmaryStudent("b");
            Student s3 = new PrmaryStudent("c");
            Student s4 = new PrmaryStudent("d");
            Student s5 = new PrmaryStudent("e");
            Student s6 = new PrmaryStudent("f");

            System.out.println("Student.count = " + Student.count);
            System.out.println("PrmaryStudent.count = " + PrmaryStudent.count);
            System.out.println("SecondaryStudent.count = " + SecondaryStudent.count);
        }

}
