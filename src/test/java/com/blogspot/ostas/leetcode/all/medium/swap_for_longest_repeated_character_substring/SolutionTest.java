package com.blogspot.ostas.leetcode.all.medium.swap_for_longest_repeated_character_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "ababa"
    Output: 3
    Explanation: We can swap the first 'b' with the last 'a', or the last 'b' with the first 'a'. Then, the longest repeated character substring is "aaa" with length 3.
    Example 2:
    Input: text = "aaabaaa"
    Output: 6
    Explanation: Swap 'b' with the last 'a' (or the first 'a'), and we get longest repeated character substring "aaaaaa" with length 6.
    Example 3:
    Input: text = "aaaaa"
    Output: 5
    Explanation: No need to swap, longest repeated character substring is "aaaaa" with length is 5.
      Constraints:
    1 <= text.length <= 2 * 104
    text consist of lowercase English characters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "ababa";
        int expected = 3;
        var result = solution.maxRepOpt1(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "aaabaaa";
        int expected = 6;
        var result = solution.maxRepOpt1(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String text = "aaaaa";
        int expected = 5;
        var result = solution.maxRepOpt1(text);
        assertThat(result).isEqualTo(expected);
    }

}
