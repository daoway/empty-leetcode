package com.blogspot.ostas.leetcode.all.easy.cells_in_a_range_on_an_excel_sheet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "K1:L2"
    Output: ["K1","K2","L1","L2"]
    Explanation:
    The above diagram shows the cells which should be present in the list.
    The red arrows denote the order in which the cells should be presented.
    Example 2:
    Input: s = "A1:F1"
    Output: ["A1","B1","C1","D1","E1","F1"]
    Explanation:
    The above diagram shows the cells which should be present in the list.
    The red arrow denotes the order in which the cells should be presented.
      Constraints:
    s.length == 5
    'A' <= s[0] <= s[3] <= 'Z'
    '1' <= s[1] <= s[4] <= '9'
    s consists of uppercase English letters, digits and ':'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "K1:L2";
        List<String> expected = List.of("K1", "K2", "L1", "L2");
        var result = solution.cellsInRange(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "A1:F1";
        List<String> expected = List.of("A1", "B1", "C1", "D1", "E1", "F1");
        var result = solution.cellsInRange(s);
        assertThat(result).isEqualTo(expected);
    }

}
