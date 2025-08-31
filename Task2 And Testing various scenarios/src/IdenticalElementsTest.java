public class IdenticalElementsTest {
    public static void main(String[] args) {
        System.out.println("=== Identical Elements Test ===");
        MinStack<Integer> stack = new MinStack<>();
        stack.push(1);
        stack.push(1);
        stack.push(1);

        System.out.println("Min: " + stack.getMin()); // 1
        stack.pop();
        stack.pop();
        System.out.println("Min after pops: " + stack.getMin()); // 1
        stack.pop();
        System.out.println("Is Empty? " + stack.isEmpty()); // true
    }
}
