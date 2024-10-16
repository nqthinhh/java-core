import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // public: Có thể truy cập từ mọi nơi
        Dog dog1 = new Dog();
        dog1.age = 3;
        System.out.println("dog1.age = " + dog1.age);


    }
}
