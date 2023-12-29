package com.blogspot.ostas.leetcode.all.hard.cut_off_trees_for_golf_event;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: forest = [[1,2,3],[0,0,4],[7,6,5]]
    Output: 6
    Explanation: Following the path above allows you to cut off the trees from shortest to tallest in 6 steps.
    Example 2:
    Input: forest = [[1,2,3],[0,0,0],[7,6,5]]
    Output: -1
    Explanation: The trees in the bottom row cannot be accessed as the middle row is blocked.
    Example 3:
    Input: forest = [[2,3,4],[0,0,5],[8,7,6]]
    Output: 6
    Explanation: You can follow the same path as Example 1 to cut off all the trees.
    Note that you can cut off the first tree at (0, 0) before making any steps.
      Constraints:
    m == forest.length
    n == forest[i].length
    1 <= m, n <= 50
    0 <= forest[i][j] <= 109
    Heights of all trees are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> forest = List.of(List.of(1, 2, 3), List.of(0, 0, 4), List.of(7, 6, 5));
        int expected = 6;
        var result = solution.cutOffTree(forest);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> forest = List.of(List.of(1, 2, 3), List.of(0, 0, 0), List.of(7, 6, 5));
        int expected = -1;
        var result = solution.cutOffTree(forest);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<Integer>> forest = List.of(List.of(2, 3, 4), List.of(0, 0, 5), List.of(8, 7, 6));
        int expected = 6;
        var result = solution.cutOffTree(forest);
        assertThat(result).isEqualTo(expected);
    }

}
