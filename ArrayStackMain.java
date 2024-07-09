public class ArrayStackMain {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.isEmpty();
        stack.isFull();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.isFull();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.isEmpty();

        stack.palindrome("racecar");
        stack.palindrome("hello");

        stack.deleteArrayStack();
    }
}
