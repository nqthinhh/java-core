import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Thêm phần tử
        stack.push(2);
        stack.push(8);
        stack.push(4);
        stack.push(7);

        // xem phần tử đỉnh
        int peek = stack.peek();
        System.out.println("peek = " + peek);

        // Lấy phần tử ở đỉnh
        int pop = stack.pop();
        System.out.println("pop = " + pop);

        System.out.println("stack = " + stack);

        // Xử lý stack
        while (!stack.empty()){
            int top = stack.pop();
            System.out.println("top" + top);
            System.out.println(stack);

        }

    }
}
