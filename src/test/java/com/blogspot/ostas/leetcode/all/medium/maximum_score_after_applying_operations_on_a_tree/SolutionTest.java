package com.blogspot.ostas.leetcode.all.medium.maximum_score_after_applying_operations_on_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[0,1],[0,2],[0,3],[2,4],[4,5]], values = [5,2,5,2,1,1]
    Output: 11
    Explanation: We can choose nodes 1, 2, 3, 4, and 5. The value of the root is non-zero. Hence, the sum of values on the path from the root to any leaf is different than zero. Therefore, the tree is healthy and the score is values[1] + values[2] + values[3] + values[4] + values[5] = 11.
    It can be shown that 11 is the maximum score obtainable after any number of operations on the tree.
    Example 2:
    Input: edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]], values = [20,10,9,7,4,3,5]
    Output: 40
    Explanation: We can choose nodes 0, 2, 3, and 4.
    - The sum of values on the path from 0 to 4 is equal to 10.
    - The sum of values on the path from 0 to 3 is equal to 10.
    - The sum of values on the path from 0 to 5 is equal to 3.
    - The sum of values on the path from 0 to 6 is equal to 5.
    Therefore, the tree is healthy and the score is values[0] + values[2] + values[3] + values[4] = 40.
    It can be shown that 40 is the maximum score obtainable after any number of operations on the tree.
      Constraints:
    2 <= n <= 2 * 104
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    values.length == n
    1 <= values[i] <= 109
    The input is generated such that edges represents a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 3}, {2, 4}, {4, 5}};
        int[] values = new int[]{5, 2, 5, 2, 1, 1};
        long expected = 11;
        var result = solution.maximumScoreAfterOperations(edges, values);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}};
        int[] values = new int[]{20, 10, 9, 7, 4, 3, 5};
        long expected = 40;
        var result = solution.maximumScoreAfterOperations(edges, values);
        assertThat(result).isEqualTo(expected);
    }

}
