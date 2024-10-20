package entity;

public class PrmaryStudent extends Student {
        public static int count;
    public PrmaryStudent(String name) {
        super(name);
        count ++;
    }
}
