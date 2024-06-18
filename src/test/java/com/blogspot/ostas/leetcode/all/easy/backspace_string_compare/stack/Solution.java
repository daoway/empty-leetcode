package com.blogspot.ostas.leetcode.all.easy.backspace_string_compare.stack;


/*
      844. backspace string compare

https://leetcode.com/problems/backspace-string-compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

*/

import java.util.Stack;

class Solution {
    private static String applyBackspaceToString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String sApply = applyBackspaceToString(s);
        String tApply = applyBackspaceToString(t);
        return sApply.equals(tApply);
    }
}