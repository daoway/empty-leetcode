package com.blogspot.ostas.leetcode.all.medium.decoded_string_at_index;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leet2code3", k = 10
    Output: "o"
    Explanation: The decoded string is "leetleetcodeleetleetcodeleetleetcode".
    The 10th letter in the string is "o".
    Example 2:
    Input: s = "ha22", k = 5
    Output: "h"
    Explanation: The decoded string is "hahahaha".
    The 5th letter is "h".
    Example 3:
    Input: s = "a2345678999999999999999", k = 1
    Output: "a"
    Explanation: The decoded string is "a" repeated 8301530446056247680 times.
    The 1st letter is "a".
      Constraints:
    2 <= s.length <= 100
    s consists of lowercase English letters and digits 2 through 9.
    s starts with a letter.
    1 <= k <= 109
    It is guaranteed that k is less than or equal to the length of the decoded string.
    The decoded string is guaranteed to have less than 263 letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leet2code3";
        int k = 10;
        String expected = "o";
        var result = solution.decodeAtIndex(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ha22";
        int k = 5;
        String expected = "h";
        var result = solution.decodeAtIndex(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "a2345678999999999999999";
        int k = 1;
        String expected = "a";
        var result = solution.decodeAtIndex(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
