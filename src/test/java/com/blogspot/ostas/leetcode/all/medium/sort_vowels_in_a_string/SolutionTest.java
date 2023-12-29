package com.blogspot.ostas.leetcode.all.medium.sort_vowels_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "lEetcOde"
    Output: "lEOtcede"
    Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.
    Example 2:
    Input: s = "lYmpH"
    Output: "lYmpH"
    Explanation: There are no vowels in s (all characters in s are consonants), so we return "lYmpH".
      Constraints:
    1 <= s.length <= 105
    s consists only of letters of the English alphabet in uppercase and lowercase.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "lEetcOde";
        String expected = "lEOtcede";
        var result = solution.sortVowels(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "lYmpH";
        String expected = "lYmpH";
        var result = solution.sortVowels(s);
        assertThat(result).isEqualTo(expected);
    }

}
