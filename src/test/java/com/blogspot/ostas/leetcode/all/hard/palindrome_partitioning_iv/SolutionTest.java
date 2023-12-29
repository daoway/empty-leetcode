package com.blogspot.ostas.leetcode.all.hard.palindrome_partitioning_iv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcbdd"
    Output: true
    Explanation: "abcbdd" = "a" + "bcb" + "dd", and all three substrings are palindromes.
    Example 2:
    Input: s = "bcbddxy"
    Output: false
    Explanation: s cannot be split into 3 palindromes.
      Constraints:
    3 <= s.length <= 2000
    s consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcbdd";
        boolean expected = true;
        var result = solution.checkPartitioning(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "bcbddxy";
        boolean expected = false;
        var result = solution.checkPartitioning(s);
        assertThat(result).isEqualTo(expected);
    }

}
