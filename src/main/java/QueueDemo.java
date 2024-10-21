import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Thêm phần tử vào cuối hàng đợi
        queue.offer(1);
        queue.offer(3);
        queue.offer(5);
        queue.offer(6);
        queue.offer(9);


        // Xem phần tử ở đầu
        int peek = queue.peek();
        System.out.println("peek = " + peek);

        System.out.println(queue);

        // Lấy phần tử đầu hàng đợi
        int poll = queue.poll();
        System.out.println("poll = " + poll);
        System.out.println(queue);

    }
}
