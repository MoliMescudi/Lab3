# Lab3

jere, ali, aidan, nikan

project manager: ali

Tasks:
1) Nikan
2) Aidan
3) Jere

---

# myStack Implementation

This Java implementation provides a custom stack data structure that adheres to the `IStack` interface specifications. The stack is implemented using a LinkedList as its internal storage mechanism. This allows for efficient insertion and removal of elements.

## IStack Interface Methods Implemented:

### 1. `void push(Character c)`
Adds the given character `c` to the stack.

### 2. `Character pop()`
Removes and returns the topmost element from the stack. Returns `null` if the stack is empty.

### 3. `Character peek()`
Returns the topmost element from the stack without removing it. Returns `null` if the stack is empty.

### 4. `boolean isEmpty()`
Checks if the stack is empty and returns `true` if it is, `false` otherwise.

## How to Use:

1. **Initialize the Stack:**
   ```java
   myStack stack = new myStack();
   ```

2. **Push Elements:**
   ```java
   stack.push('A');
   stack.push('B');
   ```

3. **Pop Elements:**
   ```java
   Character poppedElement = stack.pop();
   ```

4. **Peek the Top Element:**
   ```java
   Character topElement = stack.peek();
   ```

5. **Check if Stack is Empty:**
   ```java
   boolean isEmpty = stack.isEmpty();
   ```

