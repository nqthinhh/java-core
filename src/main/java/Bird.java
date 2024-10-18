public class Bird extends Animal implements Flyable,Runnable{
    @Override
    public void makeSound() {
        System.out.println("Lius lo");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying...");
    }

    @Override
    public void run() {
        System.out.println("Bird can run....");
    }
}
