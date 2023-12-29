package com.blogspot.ostas.leetcode.all.hard.maximum_genetic_difference_query;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: parents = [-1,0,1,1], queries = [[0,2],[3,2],[2,5]]
    Output: [2,3,7]
    Explanation: The queries are processed as follows:
    - [0,2]: The node with the maximum genetic difference is 0, with a difference of 2 XOR 0 = 2.
    - [3,2]: The node with the maximum genetic difference is 1, with a difference of 2 XOR 1 = 3.
    - [2,5]: The node with the maximum genetic difference is 2, with a difference of 5 XOR 2 = 7.
    Example 2:
    Input: parents = [3,7,-1,2,0,7,0,2], queries = [[4,6],[1,15],[0,5]]
    Output: [6,14,7]
    Explanation: The queries are processed as follows:
    - [4,6]: The node with the maximum genetic difference is 0, with a difference of 6 XOR 0 = 6.
    - [1,15]: The node with the maximum genetic difference is 1, with a difference of 15 XOR 1 = 14.
    - [0,5]: The node with the maximum genetic difference is 2, with a difference of 5 XOR 2 = 7.
      Constraints:
    2 <= parents.length <= 105
    0 <= parents[i] <= parents.length - 1 for every node i that is not the root.
    parents[root] == -1
    1 <= queries.length <= 3 * 104
    0 <= nodei <= parents.length - 1
    0 <= vali <= 2 * 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] parents = new int[]{-1, 0, 1, 1};
        int[][] queries = new int[][]{{0, 2}, {3, 2}, {2, 5}};
        int[] expected = new int[]{2, 3, 7};
        var result = solution.maxGeneticDifference(parents, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] parents = new int[]{3, 7, -1, 2, 0, 7, 0, 2};
        int[][] queries = new int[][]{{4, 6}, {1, 15}, {0, 5}};
        int[] expected = new int[]{6, 14, 7};
        var result = solution.maxGeneticDifference(parents, queries);
        assertThat(result).isEqualTo(expected);
    }

}
