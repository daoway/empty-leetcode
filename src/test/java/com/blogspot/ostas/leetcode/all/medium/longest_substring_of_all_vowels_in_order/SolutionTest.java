package com.blogspot.ostas.leetcode.all.medium.longest_substring_of_all_vowels_in_order;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
    Output: 13
    Explanation: The longest beautiful substring in word is "aaaaeiiiiouuu" of length 13.
    Example 2:
    Input: word = "aeeeiiiioooauuuaeiou"
    Output: 5
    Explanation: The longest beautiful substring in word is "aeiou" of length 5.
    Example 3:
    Input: word = "a"
    Output: 0
    Explanation: There is no beautiful substring, so return 0.
      Constraints:
    1 <= word.length <= 5 * 105
    word consists of characters 'a', 'e', 'i', 'o', and 'u'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        int expected = 13;
        var result = solution.longestBeautifulSubstring(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "aeeeiiiioooauuuaeiou";
        int expected = 5;
        var result = solution.longestBeautifulSubstring(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "a";
        int expected = 0;
        var result = solution.longestBeautifulSubstring(word);
        assertThat(result).isEqualTo(expected);
    }

}
