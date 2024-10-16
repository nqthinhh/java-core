public class Department {
    int id;
    String name;

    Department(){
        System.out.println("Constructor không tham số");
    };

    Department(int id, String name){
        System.out.println("Cons 2 tham số");
        this.id = id;
        this.name = name;
    }

}
