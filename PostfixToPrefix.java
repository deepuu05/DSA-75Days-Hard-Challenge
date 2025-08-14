
import java.util.Stack;

public class PostfixToPrefix {
    // Check if a character is an operator
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    // Convert postfix to prefix
    static String convert(String postfix) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (isOperator(ch)) {
                // Pop two operands
                String op1 = stack.pop();
                String op2 = stack.pop();
                // Combine into prefix format
                String temp = ch + op2 + op1;
                // Push back to stack
                stack.push(temp);
            } else {
                // Push operand as string
                stack.push(String.valueOf(ch));
            }
        }
           // Final result
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix = "AB+CD-*";
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Prefix Expression: " + convert(postfix));
    }
}