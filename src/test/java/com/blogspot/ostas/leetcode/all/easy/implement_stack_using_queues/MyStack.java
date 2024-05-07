package com.blogspot.ostas.leetcode.all.easy.implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

/*
      225. implement stack using queues

https://leetcode.com/problems/implement-stack-using-queues

Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
Implement the MyStack class:
void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:
You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.

*/

class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue2.offer(x); // Add the new element to queue2
        top = x; // Update the top element

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int popped = queue1.poll();
        if (!queue1.isEmpty()) {
            top = queue1.peek();
        }
        return popped;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return top;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

