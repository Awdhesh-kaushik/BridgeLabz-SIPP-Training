package StacksAndQueues;

import java.util.Stack;

public class SortStackRecursively {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    // Helper function to insert an element into a sorted stack
    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int top = stack.pop();
            insertInSortedOrder(stack, element);
            stack.push(top);
        }
    }

    // Utility function to print the stack
    public static void printStack(Stack<Integer> stack) {
        for (int item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack:");
        printStack(stack);

        sortStack(stack);

        System.out.println("Sorted Stack (ascending):");
        printStack(stack);
    }
}