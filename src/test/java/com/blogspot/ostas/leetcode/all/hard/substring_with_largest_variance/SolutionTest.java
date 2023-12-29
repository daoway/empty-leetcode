package com.blogspot.ostas.leetcode.all.hard.substring_with_largest_variance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aababbb"
    Output: 3
    Explanation:
    All possible variances along with their respective substrings are listed below:
    - Variance 0 for substrings "a", "aa", "ab", "abab", "aababb", "ba", "b", "bb", and "bbb".
    - Variance 1 for substrings "aab", "aba", "abb", "aabab", "ababb", "aababbb", and "bab".
    - Variance 2 for substrings "aaba", "ababbb", "abbb", and "babb".
    - Variance 3 for substring "babbb".
    Since the largest possible variance is 3, we return it.
    Example 2:
    Input: s = "abcde"
    Output: 0
    Explanation:
    No letter occurs more than once in s, so the variance of every substring is 0.
      Constraints:
    1 <= s.length <= 104
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aababbb";
        int expected = 3;
        var result = solution.largestVariance(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcde";
        int expected = 0;
        var result = solution.largestVariance(s);
        assertThat(result).isEqualTo(expected);
    }

}
