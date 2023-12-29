package com.blogspot.ostas.leetcode.all.medium.longest_substring_with_at_least_k_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aaabb", k = 3
    Output: 3
    Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
    Example 2:
    Input: s = "ababbc", k = 2
    Output: 5
    Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
      Constraints:
    1 <= s.length <= 104
    s consists of only lowercase English letters.
    1 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aaabb";
        int k = 3;
        int expected = 3;
        var result = solution.longestSubstring(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ababbc";
        int k = 2;
        int expected = 5;
        var result = solution.longestSubstring(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
