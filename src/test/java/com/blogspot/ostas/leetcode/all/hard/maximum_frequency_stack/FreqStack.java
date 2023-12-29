package com.blogspot.ostas.leetcode.all.hard.maximum_frequency_stack;

/*
      895. maximum frequency stack

https://leetcode.com/problems/maximum-frequency-stack

Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.
Implement the FreqStack class:
FreqStack() constructs an empty frequency stack.
void push(int val) pushes an integer val onto the top of the stack.
int pop() removes and returns the most frequent element in the stack.
If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.

*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class FreqStack {
  private int maxFreq = 0;
  private final Map<Integer, Integer> count = new HashMap<>();
  private final Map<Integer, Deque<Integer>> countToStack = new HashMap<>();

  public void push(int val) {
    count.merge(val, 1, Integer::sum);
    countToStack.putIfAbsent(count.get(val), new ArrayDeque<>());
    countToStack.get(count.get(val)).push(val);
    maxFreq = Math.max(maxFreq, count.get(val));
  }

  public int pop() {
    final int val = countToStack.get(maxFreq).pop();
    count.merge(val, -1, Integer::sum);
    if (countToStack.get(maxFreq).isEmpty()) {
      maxFreq--;
    }
    return val;
  }
}


/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */