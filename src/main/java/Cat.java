public class Cat extends Animal implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Meow ");
    }

    @Override
    public void run() {
        System.out.println("Mew can run....");
    }

}
