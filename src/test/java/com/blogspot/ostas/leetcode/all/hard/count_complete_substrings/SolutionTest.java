package com.blogspot.ostas.leetcode.all.hard.count_complete_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "igigee", k = 2
    Output: 3
    Explanation: The complete substrings where each character appears exactly twice and the difference between adjacent characters is at most 2 are: igigee, igigee, igigee.
    Example 2:
    Input: word = "aaabbbccc", k = 3
    Output: 6
    Explanation: The complete substrings where each character appears exactly three times and the difference between adjacent characters is at most 2 are: aaabbbccc, aaabbbccc, aaabbbccc, aaabbbccc, aaabbbccc, aaabbbccc.
      Constraints:
    1 <= word.length <= 105
    word consists only of lowercase English letters.
    1 <= k <= word.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "igigee";
        int k = 2;
        int expected = 3;
        var result = solution.countCompleteSubstrings(word, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "aaabbbccc";
        int k = 3;
        int expected = 6;
        var result = solution.countCompleteSubstrings(word, k);
        assertThat(result).isEqualTo(expected);
    }

}
