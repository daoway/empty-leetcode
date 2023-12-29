package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_reconstruct_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pairs = [[1,2],[2,3]]
    Output: 1
    Explanation: There is exactly one valid rooted tree, which is shown in the above figure.
    Example 2:
    Input: pairs = [[1,2],[2,3],[1,3]]
    Output: 2
    Explanation: There are multiple valid rooted trees. Three of them are shown in the above figures.
    Example 3:
    Input: pairs = [[1,2],[2,3],[2,4],[1,5]]
    Output: 0
    Explanation: There are no valid rooted trees.
      Constraints:
    1 <= pairs.length <= 105
    1 <= xi < yi <= 500
    The elements in pairs are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{1, 2}, {2, 3}};
        int expected = 1;
        var result = solution.checkWays(pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{1, 2}, {2, 3}, {1, 3}};
        int expected = 2;
        var result = solution.checkWays(pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{1, 2}, {2, 3}, {2, 4}, {1, 5}};
        int expected = 0;
        var result = solution.checkWays(pairs);
        assertThat(result).isEqualTo(expected);
    }

}
