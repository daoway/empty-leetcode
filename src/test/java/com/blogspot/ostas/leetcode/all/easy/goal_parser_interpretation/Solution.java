package com.blogspot.ostas.leetcode.all.easy.goal_parser_interpretation;

/*
      1678. goal parser interpretation

https://leetcode.com/problems/goal-parser-interpretation

You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

*/

class Solution {
  public String interpret(String command) {
    return command
        .replaceAll("\\(\\)", "o")
        .replaceAll("\\(al\\)", "al");
  }
}
