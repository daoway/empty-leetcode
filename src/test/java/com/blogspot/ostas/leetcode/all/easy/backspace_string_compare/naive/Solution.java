package com.blogspot.ostas.leetcode.all.easy.backspace_string_compare.naive;


/*
      844. backspace string compare

https://leetcode.com/problems/backspace-string-compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

*/

class Solution {
    private static String applyBackspaceToString(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                result.append(ch);
            } else if (!result.isEmpty()) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String sApply = applyBackspaceToString(s);
        String tApply = applyBackspaceToString(t);
        return sApply.equals(tApply);
    }
}