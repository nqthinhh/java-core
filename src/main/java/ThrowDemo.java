public class ThrowDemo {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            var age = 15;
            if (age >= 18) {
                System.out.println("Bạn đã đủ 18 tuổi");
            } else {
                throw new IllegalAccessException("Bạn chưa đủ 18 tuổi");
            }
        } catch (IllegalAccessException exception){
            System.out.println(exception.getMessage());
        }
    }
}
