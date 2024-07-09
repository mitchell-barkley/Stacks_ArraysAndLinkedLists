public class LinkedListStackMain {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack(0);
        stack.isEmpty();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println();
        stack.display();
        System.out.println();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        stack.display();
        System.out.println();
        stack.deleteLinkedListStack();
        System.out.println();
        stack.isEmpty();
        System.out.println();
        stack.palindrome("racecar");
        stack.palindrome("hello");
        System.out.println();
    }
}
