 // Stack implementation using an array
public class Stack_Implementation_Using_Array {

    private int top;
    private int maxsize;
    private int[] stackArray;

    // Constructor to initialize the stack
    public Stack_Implementation_Using_Array(int size) {
        top = -1;
        this.maxsize = size;
        stackArray = new int[size];
    }

    // Method to push an element onto the stack
    public void push(int val) {
        if (top == maxsize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = val;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxsize - 1;
    }

    // Method to check if the stack is empty
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to reverse the stack
    public void reverse() {
        int[] temp = new int[maxsize];
        int j = 0;
        for (int i = top; i >= 0; i--) {
            temp[j++] = stackArray[i];
        }
        for (int i = 0; i <= top; i++) {
            stackArray[i] = temp[i];
        }
    }

    // Method to print the stack
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

         public static void main(String[] args) {
        Stack_Implementation_Using_Array s = new Stack_Implementation_Using_Array(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.print();
        System.out.println("Popped: " + s.pop());
        s.print();
        System.out.println(s.peek());
        s.reverse();
        s.print();
    }
}
