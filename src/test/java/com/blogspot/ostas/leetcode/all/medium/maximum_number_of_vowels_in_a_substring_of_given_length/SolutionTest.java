package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_vowels_in_a_substring_of_given_length;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abciiidef", k = 3
    Output: 3
    Explanation: The substring "iii" contains 3 vowel letters.
    Example 2:
    Input: s = "aeiou", k = 2
    Output: 2
    Explanation: Any substring of length 2 contains 2 vowels.
    Example 3:
    Input: s = "leetcode", k = 3
    Output: 2
    Explanation: "lee", "eet" and "ode" contain 2 vowels.
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    1 <= k <= s.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abciiidef";
        int k = 3;
        int expected = 3;
        var result = solution.maxVowels(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aeiou";
        int k = 2;
        int expected = 2;
        var result = solution.maxVowels(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "leetcode";
        int k = 3;
        int expected = 2;
        var result = solution.maxVowels(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
