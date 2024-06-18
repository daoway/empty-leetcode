package com.blogspot.ostas.leetcode.all.easy.backspace_string_compare;

import java.util.ArrayList;
import java.util.List;

/*
      844. backspace string compare

https://leetcode.com/problems/backspace-string-compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

*/
class Solution {
    private static String applyBackspaceToString(String s) {
        List<Integer> removeIndex = new ArrayList<>();
        StringBuilder result = new StringBuilder(s);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                removeIndex.add(i-1);
            }
        }
        for (var index : removeIndex) {
            result.deleteCharAt(index);
        }
        return result.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String sApply = applyBackspaceToString(s);
        String tApply = applyBackspaceToString(t);
        return sApply.equals(tApply);
    }
}