package com.blogspot.ostas.leetcode.all.easy.decrypt_string_from_alphabet_to_integer_mapping;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "10#11#12"
    Output: "jkab"
    Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
    Example 2:
    Input: s = "1326#"
    Output: "acz"
      Constraints:
    1 <= s.length <= 1000
    s consists of digits and the '#' letter.
    s will be a valid string such that mapping is always possible.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "10#11#12";
        String expected = "jkab";
        var result = solution.freqAlphabets(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "1326#";
        String expected = "acz";
        var result = solution.freqAlphabets(s);
        assertThat(result).isEqualTo(expected);
    }

}
