public class BasicTest {
    public static void main(String[] args) {
        System.out.println("=== Basic Stack Operations Test ===");
        MinStack<Integer> stack = new MinStack<>();
        stack.push(5);
        stack.push(3);
        stack.push(7);

        System.out.println("Min: " + stack.getMin()); // 3
        stack.pop();
        System.out.println("Top: " + stack.peek());  // 3
        System.out.println("Min: " + stack.getMin()); // 3
    }
}
