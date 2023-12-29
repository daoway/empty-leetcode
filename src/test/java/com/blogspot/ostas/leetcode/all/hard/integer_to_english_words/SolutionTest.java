package com.blogspot.ostas.leetcode.all.hard.integer_to_english_words;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 123
    Output: "One Hundred Twenty Three"
    Example 2:
    Input: num = 12345
    Output: "Twelve Thousand Three Hundred Forty Five"
    Example 3:
    Input: num = 1234567
    Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
      Constraints:
    0 <= num <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 123;
        String expected = "One Hundred Twenty Three";
        var result = solution.numberToWords(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 12345;
        String expected = "Twelve Thousand Three Hundred Forty Five";
        var result = solution.numberToWords(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 1234567;
        String expected = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
        var result = solution.numberToWords(num);
        assertThat(result).isEqualTo(expected);
    }

}
