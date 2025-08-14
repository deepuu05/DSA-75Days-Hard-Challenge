import java.util.Arrays;

class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = n / 2 + 1;  // top1 starts from the middle of the array + 1
        top2 = n / 2;      // top2 starts from the middle of the array
    }

    void push1(int x) {
        if (top1 < size) {  // Ensure there is space for stack1
            arr[top1++] = x;  // Increment top1 and then insert the element
        } else {
            System.out.println("Stack Overflow for stack1");
        }
    }
void push2(int x) {
        if (top2 >= 0) {  // Ensure there is space for stack2
            arr[top2--] = x;  // Decrement top2 and then insert the element
        } else {
            System.out.println("Stack Overflow for stack2");
        }
    }

    int pop1() {
        if (top1 > size / 2) {  // Ensure stack1 is not empty
            return arr[--top1];  // Decrement top1 and return the element
        } else {
            return -1;  // Stack Underflow for stack1
        }
    }

    int pop2() {
        if (top2 < size / 2) {  // Ensure stack2 is not empty
            return arr[++top2];  // Increment top2 and return the element
        } else {
            return -1;  // Stack Underflow for stack2
        }
    }
     public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        System.out.print(ts.pop1() + " ");
        System.out.print(ts.pop2() + " ");
        System.out.print(ts.pop2() + " ");
//         System.out.print(ts.pop2() + "");
//     }
}
}