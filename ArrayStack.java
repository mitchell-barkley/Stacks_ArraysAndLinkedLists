public class ArrayStack {
    private int[] array;
    private int top;
    
    public ArrayStack(int size) {
        this.array = new int [size];
        this.top = -1;
        System.out.println("Stack created with size " + size);
    }
    
    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }
    
    public boolean isFull() {
        if (top == array.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            array[top + 1] = value;
            top++;
            System.out.println(value + " pushed to stack");
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = array[top];
            top--;
            System.out.println(value + " popped from stack");
            return value;
        }
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println(array[top] + " is at the top of the stack");
            return array[top];
        }
    }
    
    public void palindrome(String word) {
        word = word.toLowerCase().replaceAll(" ", "");
        int length = word.length();
        ArrayStack stack = new ArrayStack(length);
        for (int i = 0; i < length; i++) {
            stack.push(word.charAt(i));
        }
        String reverse = "";
        for (int i = 0; i < length; i++) {
            reverse = reverse + (char) stack.pop();
        }
        if (word.equals(reverse)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public void deleteArrayStack() {
        array = null;
        System.out.println("Stack deleted");
    }
}