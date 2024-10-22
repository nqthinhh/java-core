public class GarbageCollectorDemo {
    public static void main(String[] args) {
        class Animal {
            private String name;

            public Animal(String name) {
                this.name = name;
            }
        }

        Animal animal = new Animal("dog");
        animal = null;
        System.gc();
    }
}
