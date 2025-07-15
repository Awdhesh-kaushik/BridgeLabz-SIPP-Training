package StacksAndQueues;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        if(stack1.isEmpty()) {
            stack1.push(data);
        }
        else {
            while(!stack1.isEmpty()) {
                int temp = stack1.pop();
                stack2.push(temp);
            }
            stack1.push(data);
            while(!stack2.isEmpty()) {
                int temp = stack2.pop();
                stack1.push(temp);
            }
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        int data = stack1.pop();
        return data;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        return stack1.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Peek: " + queue.peek());         // 20
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 30
        System.out.println("Dequeued: " + queue.dequeue()); // 40
    }
}