package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("thinh"));
        students.add(new Student("Huy"));
        students.add(new Student("thinh"));
        students.add(new Student("thinh"));
        students.add(new Student("Tu"));
        students.add(new Student("Uyen"));

        System.out.println(students.size());
        System.out.println(students.get(3));
        System.out.println(students.get(0));
    }
}
