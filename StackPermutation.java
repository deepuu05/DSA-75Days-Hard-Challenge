import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class StackPermutation {
    public static boolean checkPerm(int[] a, int[] b) {
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 0; i < a.length; i++) q1.offer(a[i]);
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < b.length; i++) q2.offer(b[i]);
        Stack<Integer> st = new Stack<>();
        // Dequeue all items one by one
        while (!q1.isEmpty()) {
            int ele = q1.poll();
            if (ele == q2.peek()) {
                // If matches, then dequeue from
                // the output queue also
                q2.poll();
                // Now see if top of the stack
                // also matches the front
                while (!st.isEmpty()) {
                    if (st.peek() == q2.peek()) {
                        st.pop();
                        q2.poll();
                    } else
                        break;
                }
            } else
                st.push(ele);
        }
        boolean res = (q1.isEmpty() && st.isEmpty());
        System.out.println(res ? "True" : "False");
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};
        checkPerm(a, b);
    }
}