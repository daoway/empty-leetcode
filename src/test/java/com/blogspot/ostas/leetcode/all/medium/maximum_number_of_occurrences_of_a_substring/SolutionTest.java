package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_occurrences_of_a_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
    Output: 2
    Explanation: Substring "aab" has 2 occurrences in the original string.
    It satisfies the conditions, 2 unique letters and size 3 (between minSize and maxSize).
    Example 2:
    Input: s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
    Output: 2
    Explanation: Substring "aaa" occur 2 times in the string. It can overlap.
      Constraints:
    1 <= s.length <= 105
    1 <= maxLetters <= 26
    1 <= minSize <= maxSize <= min(26, s.length)
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aababcaab";
        int maxLetters = 2;
        int minSize = 3;
        int maxSize = 4;
        int expected = 2;
        var result = solution.maxFreq(s, maxLetters, minSize, maxSize);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaaa";
        int maxLetters = 1;
        int minSize = 3;
        int maxSize = 3;
        int expected = 2;
        var result = solution.maxFreq(s, maxLetters, minSize, maxSize);
        assertThat(result).isEqualTo(expected);
    }

}
