// Java program for the above approach
import java.util.*;
public class CloneStack
{
    static Stack<Integer> S = new Stack<Integer>();
    static Stack<Integer> Des = new Stack<Integer>(); // Stores the destination stack
    static void RecursiveCloneStack()
    {
        if (S.size() == 0)
            return;
        int val = S.peek();
        S.pop();
        RecursiveCloneStack();
        Des.push(val);
    }
    static void cloneStack()
    {
        RecursiveCloneStack();
        System.out.print("Destination:- ");
        int f = 0;
        while (Des.size() > 0) {
            if (f == 0) {
                System.out.print(Des.peek());
                f = 1;
            }
            else
                System.out.print("              " + Des.peek());
            Des.pop();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        cloneStack();
    }
}
