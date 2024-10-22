public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfo(){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }
    public class Gender{
        private String value;

        public Gender(String value) {
            this.value = value;
        }

        public void showInfo(){
            System.out.println("value = " + value);
        }
    }
}
