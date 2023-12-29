package com.blogspot.ostas.leetcode.all.easy.pascal_s_triangle_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rowIndex = 3
    Output: [1,3,3,1]
    Example 2:
    Input: rowIndex = 0
    Output: [1]
    Example 3:
    Input: rowIndex = 1
    Output: [1,1]
      Constraints:
    0 <= rowIndex <= 33
      Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int rowIndex = 3;
        List<Integer> expected = List.of(1, 3, 3, 1);
        var result = solution.getRow(rowIndex);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int rowIndex = 0;
        List<Integer> expected = List.of(1);
        var result = solution.getRow(rowIndex);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int rowIndex = 1;
        List<Integer> expected = List.of(1, 1);
        var result = solution.getRow(rowIndex);
        assertThat(result).isEqualTo(expected);
    }

}
