package com.blogspot.ostas.leetcode.all.easy.reverse_vowels_of_a_string.optimized;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "hello"
    Output: "holle"
    Example 2:
    Input: s = "leetcode"
    Output: "leotcede"
      Constraints:
    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "hello";
        String expected = "holle";
        var result = solution.reverseVowels(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcode";
        String expected = "leotcede";
        var result = solution.reverseVowels(s);
        assertThat(result).isEqualTo(expected);
    }

}
