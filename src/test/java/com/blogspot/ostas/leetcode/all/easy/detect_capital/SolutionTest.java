package com.blogspot.ostas.leetcode.all.easy.detect_capital;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "USA"
    Output: true
    Example 2:
    Input: word = "FlaG"
    Output: false
      Constraints:
    1 <= word.length <= 100
    word consists of lowercase and uppercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "USA";
        boolean expected = true;
        var result = solution.detectCapitalUse(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "FlaG";
        boolean expected = false;
        var result = solution.detectCapitalUse(word);
        assertThat(result).isEqualTo(expected);
    }

}
