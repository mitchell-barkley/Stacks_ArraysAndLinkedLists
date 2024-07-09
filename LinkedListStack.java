public class LinkedListStack {
    private int data;
    private int size;
    private LinkedListStack top;
    private LinkedListStack bottom;
    private LinkedListStack previous;
    private LinkedListStack current;
    private LinkedListStack next;
    private LinkedListStack temp;

    public LinkedListStack() {
        this.top = null;
        this.bottom = null;
        this.previous = null;
        this.current = null;
        this.next = null;
        this.temp = null;
    }
    
    public LinkedListStack(int size) {
        if (size == 0) {
            top = null;
            System.out.println("Stack created");
        } else {
            top = new LinkedListStack();
            top.data = 0;
            top.next = null;
            this.size = size;
            System.out.println("Stack created with size " + size);
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            System.out.println("Stack is empty");
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public void push(int value) {
        if (top == null) {
            top = new LinkedListStack();
            top.data = value;
            top.next = null;
        } else {
            temp = new LinkedListStack();
            temp.data = value;
            temp.next = top;
            top = temp;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            size--;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println(top.data + " is at the top of the stack");
            return top.data;
        }
    }

    public void palindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            push(word.charAt(i));
        }
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            reverse += (char) pop();
        }
        if (word.equals(reverse)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public void deleteLinkedList() {
        top = null;
        System.out.println("Stack is deleted");
    }

    public void display() {
        current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void search(int value) {
        current = top;
        int position = 1;
        while (current != null) {
            if (current.data == value) {
                System.out.println(value + " found at position " + position);
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println(value + " not found");
    }

    public void delete(int value) {
        current = top;
        previous = null;
        while (current != null) {
            if (current.data == value) {
                if (previous == null) {
                    top = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                System.out.println(value + " deleted from stack");
                return;
            }
            previous = current;
            current = current.next;
        }
        System.out.println(value + " not found");
    }

    public void deleteLinkedListStack() {
        top = null;
        System.out.println("Stack deleted");
    }
}
