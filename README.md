# Lab3

jere, ali, aidan, nikan

project manager: ali

task 1: nikan
task 2: aiden
task 3:jere


myStack Implementation
This Java implementation provides a custom stack data structure that adheres to the IStack interface specifications. The stack is implemented using a LinkedList as its internal storage mechanism. This allows for efficient insertion and removal of elements.

IStack Interface Methods Implemented:
1. void push(Character c)
Adds the given character c to the stack.

2. Character pop()
Removes and returns the topmost element from the stack. Returns null if the stack is empty.

3. Character peek()
Returns the topmost element from the stack without removing it. Returns null if the stack is empty.

4. boolean isEmpty()
Checks if the stack is empty and returns true if it is, false otherwise.

How to Use:
Initialize the Stack:

java
Copy code
myStack stack = new myStack();
Push Elements:

java
Copy code
stack.push('A');
stack.push('B');
Pop Elements:

java
Copy code
Character poppedElement = stack.pop();
Peek the Top Element:

java
Copy code
Character topElement = stack.peek();
Check if Stack is Empty:

java
Copy code
boolean isEmpty = stack.isEmpty();
Important Note:
