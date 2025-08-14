import java.util.*;

public class QueueUsingStack {

    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {

            // Move all elements from s1 to s2
            while (!s1.empty()) {
                s2.push(s1.peek());
                s1.pop();
            }

            // Push item into s1
            s1.push(x);

            // Push everything back to s1
            while (!s2.empty()) {
                s1.push(s2.peek());
                s2.pop();
            }
        }

        // Dequeue an item from the queue
        int dequeue() {

            // if first stack is empty
            if (s1.empty()) {
                return -1;
            }

            // Return top of s1
            int x = s1.peek();
            s1.pop();
            return x;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
