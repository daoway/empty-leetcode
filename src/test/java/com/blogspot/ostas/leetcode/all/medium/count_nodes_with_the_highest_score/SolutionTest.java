package com.blogspot.ostas.leetcode.all.medium.count_nodes_with_the_highest_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: parents = [-1,2,0,2,0]
    Output: 3
    Explanation:
    - The score of node 0 is: 3 * 1 = 3
    - The score of node 1 is: 4 = 4
    - The score of node 2 is: 1 * 1 * 2 = 2
    - The score of node 3 is: 4 = 4
    - The score of node 4 is: 4 = 4
    The highest score is 4, and three nodes (node 1, node 3, and node 4) have the highest score.
    Example 2:
    Input: parents = [-1,2,0]
    Output: 2
    Explanation:
    - The score of node 0 is: 2 = 2
    - The score of node 1 is: 2 = 2
    - The score of node 2 is: 1 * 1 = 1
    The highest score is 2, and two nodes (node 0 and node 1) have the highest score.
      Constraints:
    n == parents.length
    2 <= n <= 105
    parents[0] == -1
    0 <= parents[i] <= n - 1 for i != 0
    parents represents a valid binary tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] parents = new int[]{-1, 2, 0, 2, 0};
        int expected = 3;
        var result = solution.countHighestScoreNodes(parents);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] parents = new int[]{-1, 2, 0};
        int expected = 2;
        var result = solution.countHighestScoreNodes(parents);
        assertThat(result).isEqualTo(expected);
    }

}
