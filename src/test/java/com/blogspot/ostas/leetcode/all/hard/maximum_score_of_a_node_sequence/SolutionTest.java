package com.blogspot.ostas.leetcode.all.hard.maximum_score_of_a_node_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: scores = [5,2,9,8,4], edges = [[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]
    Output: 24
    Explanation: The figure above shows the graph and the chosen node sequence [0,1,2,3].
    The score of the node sequence is 5 + 2 + 9 + 8 = 24.
    It can be shown that no other node sequence has a score of more than 24.
    Note that the sequences [3,1,2,0] and [1,0,2,3] are also valid and have a score of 24.
    The sequence [0,3,2,4] is not valid since no edge connects nodes 0 and 3.
    Example 2:
    Input: scores = [9,20,6,4,11,12], edges = [[0,3],[5,3],[2,4],[1,3]]
    Output: -1
    Explanation: The figure above shows the graph.
    There are no valid node sequences of length 4, so we return -1.
      Constraints:
    n == scores.length
    4 <= n <= 5 * 104
    1 <= scores[i] <= 108
    0 <= edges.length <= 5 * 104
    edges[i].length == 2
    0 <= ai, bi <= n - 1
    ai != bi
    There are no duplicate edges.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] scores = new int[]{5, 2, 9, 8, 4};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}};
        int expected = 24;
        var result = solution.maximumScore(scores, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] scores = new int[]{9, 20, 6, 4, 11, 12};
        int[][] edges = new int[][]{{0, 3}, {5, 3}, {2, 4}, {1, 3}};
        int expected = -1;
        var result = solution.maximumScore(scores, edges);
        assertThat(result).isEqualTo(expected);
    }

}
