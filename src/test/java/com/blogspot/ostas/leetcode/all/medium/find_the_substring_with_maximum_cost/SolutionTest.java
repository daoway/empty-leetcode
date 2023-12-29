package com.blogspot.ostas.leetcode.all.medium.find_the_substring_with_maximum_cost;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "adaa", chars = "d", vals = [-1000]
    Output: 2
    Explanation: The value of the characters "a" and "d" is 1 and -1000 respectively.
    The substring with the maximum cost is "aa" and its cost is 1 + 1 = 2.
    It can be proven that 2 is the maximum cost.
    Example 2:
    Input: s = "abc", chars = "abc", vals = [-1,-1,-1]
    Output: 0
    Explanation: The value of the characters "a", "b" and "c" is -1, -1, and -1 respectively.
    The substring with the maximum cost is the empty substring "" and its cost is 0.
    It can be proven that 0 is the maximum cost.
      Constraints:
    1 <= s.length <= 105
    s consist of lowercase English letters.
    1 <= chars.length <= 26
    chars consist of distinct lowercase English letters.
    vals.length == chars.length
    -1000 <= vals[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "adaa";
        String chars = "d";
        int[] vals = new int[]{-1000};
        int expected = 2;
        var result = solution.maximumCostSubstring(s, chars, vals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abc";
        String chars = "abc";
        int[] vals = new int[]{-1, -1, -1};
        int expected = 0;
        var result = solution.maximumCostSubstring(s, chars, vals);
        assertThat(result).isEqualTo(expected);
    }

}
