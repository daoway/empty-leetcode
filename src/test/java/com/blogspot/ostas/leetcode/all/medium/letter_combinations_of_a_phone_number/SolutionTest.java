package com.blogspot.ostas.leetcode.all.medium.letter_combinations_of_a_phone_number;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    Example 2:
    Input: digits = ""
    Output: []
    Example 3:
    Input: digits = "2"
    Output: ["a","b","c"]
      Constraints:
    0 <= digits.length <= 4
    digits[i] is a digit in the range ['2', '9'].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String digits = "23";
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        var result = solution.letterCombinations(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String digits = "";
        List<String> expected = List.of();
        var result = solution.letterCombinations(digits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String digits = "2";
        List<String> expected = List.of("a", "b", "c");
        var result = solution.letterCombinations(digits);
        assertThat(result).isEqualTo(expected);
    }

}
