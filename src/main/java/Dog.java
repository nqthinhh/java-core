public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running...");
    }
}
