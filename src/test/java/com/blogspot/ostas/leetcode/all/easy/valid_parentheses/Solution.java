package com.blogspot.ostas.leetcode.all.easy.valid_parentheses;

/*
      20. valid parentheses

https://leetcode.com/problems/valid-parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
  private final Map<Character, Character> bracketPairs;

  public Solution() {
    bracketPairs = new HashMap<>();
    bracketPairs.put('(', ')');
    bracketPairs.put('[', ']');
    bracketPairs.put('{', '}');
  }

  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (final char c : s.toCharArray()){
      if(bracketPairs.containsKey(c)){
        stack.push(bracketPairs.get(c));
      }
      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }
    return stack.isEmpty();
  }
}