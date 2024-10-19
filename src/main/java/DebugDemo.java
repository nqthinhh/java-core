public class DebugDemo {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,12,7,8};
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number){
                max = number;
            }
        }
        System.out.println("max" + max);
    }
}
