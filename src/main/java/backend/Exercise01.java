package backend;

import entity.Student;

import java.util.*;

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

    public static void question06(){
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Hung");
        students.put(2 ,"Duc");

        Set<Integer> keys = students.keySet();
        for (Integer key : keys) {
            System.out.println("key = " + key);
        }
    }
}
