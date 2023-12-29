package com.blogspot.ostas.leetcode.all.easy.excel_sheet_column_title;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: columnNumber = 1
    Output: "A"
    Example 2:
    Input: columnNumber = 28
    Output: "AB"
    Example 3:
    Input: columnNumber = 701
    Output: "ZY"
      Constraints:
    1 <= columnNumber <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int columnNumber = 1;
        String expected = "A";
        var result = solution.convertToTitle(columnNumber);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int columnNumber = 28;
        String expected = "AB";
        var result = solution.convertToTitle(columnNumber);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int columnNumber = 701;
        String expected = "ZY";
        var result = solution.convertToTitle(columnNumber);
        assertThat(result).isEqualTo(expected);
    }

}
