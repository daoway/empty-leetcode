package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_steps_to_make_two_strings_anagram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "bab", t = "aba"
    Output: 1
    Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
    Example 2:
    Input: s = "leetcode", t = "practice"
    Output: 5
    Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
    Example 3:
    Input: s = "anagram", t = "mangaar"
    Output: 0
    Explanation: "anagram" and "mangaar" are anagrams.
      Constraints:
    1 <= s.length <= 5 * 104
    s.length == t.length
    s and t consist of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "bab";
        String t = "aba";
        int expected = 1;
        var result = solution.minSteps(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcode";
        String t = "practice";
        int expected = 5;
        var result = solution.minSteps(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "anagram";
        String t = "mangaar";
        int expected = 0;
        var result = solution.minSteps(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
