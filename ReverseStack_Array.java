import java.util.Stack;

public class ReverseStack_Array {
    // Method to reverse the stack using recursion
    public static void reverse(Stack<Character> stack) {
        if (stack.isEmpty()) {
            return;
        }
        char temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
    }

    // Method to insert an element at the bottom of the stack
    private static void insertAtBottom(Stack<Character> stack, char val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        char temp = stack.pop();
        insertAtBottom(stack, val);
        stack.push(temp);
    }
    
   // Method to print the stack
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        s.push('A');
        s.push('B');
        s.push('C');
        s.push('D');

        System.out.println("Original Stack: " + s);
        reverse(s);
        System.out.println("Reversed Stack: " + s);
    }
}
