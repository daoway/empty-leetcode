package com.blogspot.ostas.leetcode.all.medium.maximize_number_of_subsequences_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "abdcdbc", pattern = "ac"
    Output: 4
    Explanation:
    If we add pattern[0] = 'a' in between text[1] and text[2], we get "abadcdbc". Now, the number of times "ac" occurs as a subsequence is 4.
    Some other strings which have 4 subsequences "ac" after adding a character to text are "aabdcdbc" and "abdacdbc".
    However, strings such as "abdcadbc", "abdccdbc", and "abdcdbcc", although obtainable, have only 3 subsequences "ac" and are thus suboptimal.
    It can be shown that it is not possible to get more than 4 subsequences "ac" by adding only one character.
    Example 2:
    Input: text = "aabb", pattern = "ab"
    Output: 6
    Explanation:
    Some of the strings which can be obtained from text and have 6 subsequences "ab" are "aaabb", "aaabb", and "aabbb".
      Constraints:
    1 <= text.length <= 105
    pattern.length == 2
    text and pattern consist only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "abdcdbc";
        String pattern = "ac";
        long expected = 4;
        var result = solution.maximumSubsequenceCount(text, pattern);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "aabb";
        String pattern = "ab";
        long expected = 6;
        var result = solution.maximumSubsequenceCount(text, pattern);
        assertThat(result).isEqualTo(expected);
    }

}
