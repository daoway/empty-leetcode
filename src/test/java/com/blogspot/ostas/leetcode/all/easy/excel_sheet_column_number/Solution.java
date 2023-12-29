package com.blogspot.ostas.leetcode.all.easy.excel_sheet_column_number;

/*
      171. excel sheet column number

https://leetcode.com/problems/excel-sheet-column-number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
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
  public int titleToNumber(String columnTitle) {
    var chars =columnTitle.toCharArray();
    int result = 0;
    for (int i = 0; i < chars.length; i++) {
      char currentChar = chars[chars.length - 1 - i];
      int charValue = currentChar - 'A' + 1;
      result += charValue * Math.pow(26, i);
    }
    return result;
  }
}