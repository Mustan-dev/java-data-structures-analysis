import java.util.Stack;

public class MinStack<T extends Comparable<T>> {
    private Stack<T> mainStack;
    private Stack<T> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(T item) {
        mainStack.push(item);
        if (minStack.isEmpty() || item.compareTo(minStack.peek()) <= 0) {
            minStack.push(item);
        }
    }

    public T pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T popped = mainStack.pop();
        if (popped.equals(minStack.peek())) {
            minStack.pop();
        }
        return popped;
    }

    public T peek() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return mainStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public T getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }
}
