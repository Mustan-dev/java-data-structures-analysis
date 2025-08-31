public class SingleElementTest {
    public static void main(String[] args) {
        System.out.println("=== Single Element Test ===");
        MinStack<Integer> stack = new MinStack<>();
        stack.push(10);

        System.out.println("Min: " + stack.getMin()); // 10
        stack.pop();
        System.out.println("Is Empty? " + stack.isEmpty()); // true
    }
}
