package entity;

public class Student {
    private int id;
    private String name;
    public static String college;
    public static int count;

    public Student(String name) {
        count ++ ;
        this.id = count;
        this.name = name;
    }
}
