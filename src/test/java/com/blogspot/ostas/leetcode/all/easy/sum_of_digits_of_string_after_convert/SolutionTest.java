package com.blogspot.ostas.leetcode.all.easy.sum_of_digits_of_string_after_convert;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "iiii", k = 1
    Output: 36
    Explanation: The operations are as follows:
    - Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
    - Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
    Thus the resulting integer is 36.
    Example 2:
    Input: s = "leetcode", k = 2
    Output: 6
    Explanation: The operations are as follows:
    - Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
    - Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
    - Transform #2: 33 ➝ 3 + 3 ➝ 6
    Thus the resulting integer is 6.
    Example 3:
    Input: s = "zbax", k = 2
    Output: 8
      Constraints:
    1 <= s.length <= 100
    1 <= k <= 10
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "iiii";
        int k = 1;
        int expected = 36;
        var result = solution.getLucky(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcode";
        int k = 2;
        int expected = 6;
        var result = solution.getLucky(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "zbax";
        int k = 2;
        int expected = 8;
        var result = solution.getLucky(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
