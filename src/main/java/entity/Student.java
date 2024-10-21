package entity;

public class Student {
    private int id;
    private String name;

    private static int count;

    public Student(String name) {

        this.id = ++count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
