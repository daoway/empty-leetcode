package com.blogspot.ostas.leetcode.all.medium.longest_ideal_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "acfgbd", k = 2
    Output: 4
    Explanation: The longest ideal string is "acbd". The length of this string is 4, so 4 is returned.
    Note that "acfgbd" is not ideal because 'c' and 'f' have a difference of 3 in alphabet order.
    Example 2:
    Input: s = "abcd", k = 3
    Output: 4
    Explanation: The longest ideal string is "abcd". The length of this string is 4, so 4 is returned.
      Constraints:
    1 <= s.length <= 105
    0 <= k <= 25
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "acfgbd";
        int k = 2;
        int expected = 4;
        var result = solution.longestIdealString(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        int k = 3;
        int expected = 4;
        var result = solution.longestIdealString(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
