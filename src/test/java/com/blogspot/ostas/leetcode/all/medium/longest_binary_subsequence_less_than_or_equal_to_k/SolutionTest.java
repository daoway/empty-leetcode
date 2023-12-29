package com.blogspot.ostas.leetcode.all.medium.longest_binary_subsequence_less_than_or_equal_to_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1001010", k = 5
    Output: 5
    Explanation: The longest subsequence of s that makes up a binary number less than or equal to 5 is "00010", as this number is equal to 2 in decimal.
    Note that "00100" and "00101" are also possible, which are equal to 4 and 5 in decimal, respectively.
    The length of this subsequence is 5, so 5 is returned.
    Example 2:
    Input: s = "00101001", k = 1
    Output: 6
    Explanation: "000001" is the longest subsequence of s that makes up a binary number less than or equal to 1, as this number is equal to 1 in decimal.
    The length of this subsequence is 6, so 6 is returned.
      Constraints:
    1 <= s.length <= 1000
    s[i] is either '0' or '1'.
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1001010";
        int k = 5;
        int expected = 5;
        var result = solution.longestSubsequence(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "00101001";
        int k = 1;
        int expected = 6;
        var result = solution.longestSubsequence(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
