# Lab3

jere, ali, aidan, nikan

project manager: ali

task 1: nikan
task 2: aiden
task 3:jere


Certainly! A good README file provides essential information about the codebase and how to use it. Here's an example README file for your `myStack` class implementation:

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

## Important Note:

- This implementation uses a LinkedList for internal storage, providing flexibility and efficient stack operations.
- Ensure to handle null values appropriately when popping or peeking from an empty stack.

Feel free to use this custom stack implementation in your Java projects!

---

Make sure to include this README file in your project repository. You can modify and expand it according to your specific project requirements or add information about the `IPostFixCal` interface and how it can be used in conjunction with this custom stack implementation.

```java
stack.push('A');
stack.push('B');
```

```java
Character poppedElement = stack.pop();
Peek the Top Element:
```
```java
Character topElement = stack.peek();
Check if Stack is Empty:
```
```java
boolean isEmpty = stack.isEmpty();
Important Note:
```
