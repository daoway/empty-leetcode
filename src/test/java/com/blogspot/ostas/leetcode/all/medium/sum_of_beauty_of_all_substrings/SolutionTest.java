package com.blogspot.ostas.leetcode.all.medium.sum_of_beauty_of_all_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aabcb"
    Output: 5
    Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
    Example 2:
    Input: s = "aabcbaa"
    Output: 17
      Constraints:
    1 <= s.length <= 500
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aabcb";
        int expected = 5;
        var result = solution.beautySum(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aabcbaa";
        int expected = 17;
        var result = solution.beautySum(s);
        assertThat(result).isEqualTo(expected);
    }

}
