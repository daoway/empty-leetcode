package com.blogspot.ostas.leetcode.all.easy.reformat_date;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: date = "20th Oct 2052"
    Output: "2052-10-20"
    Example 2:
    Input: date = "6th Jun 1933"
    Output: "1933-06-06"
    Example 3:
    Input: date = "26th May 1960"
    Output: "1960-05-26"
      Constraints:
    The given dates are guaranteed to be valid, so no error handling is necessary.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String date = "20th Oct 2052";
        String expected = "2052-10-20";
        var result = solution.reformatDate(date);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String date = "6th Jun 1933";
        String expected = "1933-06-06";
        var result = solution.reformatDate(date);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String date = "26th May 1960";
        String expected = "1960-05-26";
        var result = solution.reformatDate(date);
        assertThat(result).isEqualTo(expected);
    }

}
