
public class ReverseStack_LL {
    // Node class to represent each element in the stack
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the stack using a linked list
    public Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev; 
    }

    // Method to print the stack
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    // Main method to test the stack reversal
    public static void main(String[] args) {
        ReverseStack_LL stack = new ReverseStack_LL();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Stack: ");
        stack.printList(head);

        head = stack.reverse(head); 
        System.out.println("Reversed Stack: ");
        stack.printList(head);
    }
}
