package com.blogspot.ostas.leetcode.all.easy.excel_sheet_column_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: columnTitle = "A"
    Output: 1
    Example 2:
    Input: columnTitle = "AB"
    Output: 28
    Example 3:
    Input: columnTitle = "ZY"
    Output: 701
      Constraints:
    1 <= columnTitle.length <= 7
    columnTitle consists only of uppercase English letters.
    columnTitle is in the range ["A", "FXSHRXW"].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String columnTitle = "A";
        int expected = 1;
        var result = solution.titleToNumber(columnTitle);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String columnTitle = "AB";
        int expected = 28;
        var result = solution.titleToNumber(columnTitle);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String columnTitle = "ZY";
        int expected = 701;
        var result = solution.titleToNumber(columnTitle);
        assertThat(result).isEqualTo(expected);
    }

}
