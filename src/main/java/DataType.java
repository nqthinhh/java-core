import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        // Kiểu số nguyên : byte(1), short(2), int(4), long(8)
        int age = 18;
        System.out.println("age = " + age);

        // Kiểu số thực: float(4), double (8)
        float pi = 3.14f;
        System.out.println("pi = " + pi);

        //Kiểu logic: boolean
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        //Kiểu kí tự: char(2)
        char c = 'A';
        System.out.println("c = " + c);

        //Kiểu xâu kí tự: String
        String name = "Thịnh";
        System.out.println("name = " + name);

        //Kiểu enum
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        // Class & Object
        Dog dog1 = new Dog();
        dog1.name = "Shiba";
        dog1.age = 5;
        dog1.gender = Gender.FEMALE;
        dog1.bark();
        int sum= dog1.sum(1, 10);
        System.out.println("sum = " + sum);

        Dog dog2 = new Dog();
        dog2.name = "Pitbull";
        dog2.age =1;
        dog2.gender = Gender.MALE;
        dog2.bark();
    }
}
