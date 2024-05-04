package com.blogspot.ostas.leetcode.all.easy.excel_sheet_column_title;

/*
      168. excel sheet column title

https://leetcode.com/problems/excel-sheet-column-title

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

*/
class Solution {
    private static final int start;

    static {
        start = 'A' - 1;
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                result.append('Z');
                columnNumber = columnNumber / 26 - 1;
            } else {
                result.append(Character.toChars(remainder + start));
                columnNumber /= 26;
            }
        }
        return result.reverse().toString();
    }
}