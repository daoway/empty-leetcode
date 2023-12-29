package com.blogspot.ostas.leetcode.all.easy.pascal_s_triangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    Example 2:
    Input: numRows = 1
    Output: [[1]]
      Constraints:
    1 <= numRows <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int numRows = 5;
        List<List<Integer>> expected =
                List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1),
                        List.of(1, 4, 6, 4, 1));
        var result = solution.generate(numRows);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int numRows = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        var result = solution.generate(numRows);
        assertThat(result).isEqualTo(expected);
    }

}
