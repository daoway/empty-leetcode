package com.blogspot.ostas.leetcode.all.medium.unique_binary_search_trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 5
    Example 2:
    Input: n = 1
    Output: 1
      Constraints:
    1 <= n <= 19
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 5;
        var result = solution.numTrees(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.numTrees(n);
        assertThat(result).isEqualTo(expected);
    }

}
