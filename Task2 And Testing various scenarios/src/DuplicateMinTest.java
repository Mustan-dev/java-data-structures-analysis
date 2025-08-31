public class DuplicateMinTest {
    public static void main(String[] args) {
        System.out.println("=== Duplicate Minimums Test ===");
        MinStack<Integer> stack = new MinStack<>();
        stack.push(4);
        stack.push(2);
        stack.push(2);
        stack.push(5);

        System.out.println("Min: " + stack.getMin()); // 2
        stack.pop(); // 5
        stack.pop(); // 2
        System.out.println("Min after popping one 2: " + stack.getMin()); // 2
        stack.pop(); // another 2
        System.out.println("Min after popping all 2s: " + stack.getMin()); // 4
    }
}
