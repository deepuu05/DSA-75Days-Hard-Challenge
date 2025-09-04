import java.util.Stack;

class SpecialStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        s.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        } else {
            minStack.push(minStack.peek());
        }
    }
    public int pop() {
        if (s.isEmpty()) {
            return -1;
        }
        int poppedElement = s.pop();
        minStack.pop();
        return poppedElement;
    }
    public int peek() {
        if (s.isEmpty()) {
            return -1;
        }
        return s.peek();
    }
    public boolean isEmpty() {
        return s.isEmpty();
    }
    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}

public class GetMinStack {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();
        
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(15);
        stack.push(16);

        System.out.println(stack.getMin());
    }
}