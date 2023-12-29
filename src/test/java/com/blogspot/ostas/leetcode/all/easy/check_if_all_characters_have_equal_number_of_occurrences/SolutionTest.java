package com.blogspot.ostas.leetcode.all.easy.check_if_all_characters_have_equal_number_of_occurrences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abacbc"
    Output: true
    Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
    Example 2:
    Input: s = "aaabb"
    Output: false
    Explanation: The characters that appear in s are 'a' and 'b'.
    'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
      Constraints:
    1 <= s.length <= 1000
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abacbc";
        boolean expected = true;
        var result = solution.areOccurrencesEqual(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaabb";
        boolean expected = false;
        var result = solution.areOccurrencesEqual(s);
        assertThat(result).isEqualTo(expected);
    }

}
