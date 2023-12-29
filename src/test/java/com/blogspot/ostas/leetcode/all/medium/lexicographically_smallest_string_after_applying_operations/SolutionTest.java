package com.blogspot.ostas.leetcode.all.medium.lexicographically_smallest_string_after_applying_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "5525", a = 9, b = 2
    Output: "2050"
    Explanation: We can apply the following operations:
    Start:  "5525"
    Rotate: "2555"
    Add:    "2454"
    Add:    "2353"
    Rotate: "5323"
    Add:    "5222"
    Add:    "5121"
    Rotate: "2151"
    Add:    "2050"
    There is no way to obtain a string that is lexicographically smaller than "2050".
    Example 2:
    Input: s = "74", a = 5, b = 1
    Output: "24"
    Explanation: We can apply the following operations:
    Start:  "74"
    Rotate: "47"
    Add:    "42"
    Rotate: "24"
    There is no way to obtain a string that is lexicographically smaller than "24".
    Example 3:
    Input: s = "0011", a = 4, b = 2
    Output: "0011"
    Explanation: There are no sequence of operations that will give us a lexicographically smaller string than "0011".
      Constraints:
    2 <= s.length <= 100
    s.length is even.
    s consists of digits from 0 to 9 only.
    1 <= a <= 9
    1 <= b <= s.length - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "5525";
        int a = 9;
        int b = 2;
        String expected = "2050";
        var result = solution.findLexSmallestString(s, a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "74";
        int a = 5;
        int b = 1;
        String expected = "24";
        var result = solution.findLexSmallestString(s, a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "0011";
        int a = 4;
        int b = 2;
        String expected = "0011";
        var result = solution.findLexSmallestString(s, a, b);
        assertThat(result).isEqualTo(expected);
    }

}
