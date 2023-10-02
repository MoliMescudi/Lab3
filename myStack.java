package lab2cos285;

import java.util.LinkedList;


//made by nikan
public class myStack implements IStack {
    private LinkedList<Character> stack;

    public myStack() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(Character c) {
    	stack.addFirst(c); // Add to the beginning of the LinkedList
    }
    
    

    @Override
    public Character pop() {
        if (isEmpty()) {
            return null; // Return null if the stack is empty
        }
        return stack.removeFirst(); // Remove and return the first element of the LinkedList
    }

    @Override
    public Character peek() {
        if (isEmpty()) {
            return null; // Return null if the stack is empty
        }
        return stack.getFirst(); // Return the first element of the LinkedList without removing it
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty(); // Check if the stack is empty
    }
}
