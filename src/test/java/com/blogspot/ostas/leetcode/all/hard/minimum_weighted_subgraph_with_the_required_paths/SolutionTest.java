package com.blogspot.ostas.leetcode.all.hard.minimum_weighted_subgraph_with_the_required_paths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, edges = [[0,2,2],[0,5,6],[1,0,3],[1,4,5],[2,1,1],[2,3,3],[2,3,4],[3,4,2],[4,5,1]], src1 = 0, src2 = 1, dest = 5
    Output: 9
    Explanation:
    The above figure represents the input graph.
    The blue edges represent one of the subgraphs that yield the optimal answer.
    Note that the subgraph [[1,0,3],[0,5,6]] also yields the optimal answer. It is not possible to get a subgraph with less weight satisfying all the constraints.
    Example 2:
    Input: n = 3, edges = [[0,1,1],[2,1,1]], src1 = 0, src2 = 1, dest = 2
    Output: -1
    Explanation:
    The above figure represents the input graph.
    It can be seen that there does not exist any path from node 1 to node 2, hence there are no subgraphs satisfying all the constraints.
      Constraints:
    3 <= n <= 105
    0 <= edges.length <= 105
    edges[i].length == 3
    0 <= fromi, toi, src1, src2, dest <= n - 1
    fromi != toi
    src1, src2, and dest are pairwise distinct.
    1 <= weight[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{0, 2, 2}, {0, 5, 6}, {1, 0, 3}, {1, 4, 5}, {2, 1, 1}, {2, 3, 3},
                {2, 3, 4}, {3, 4, 2}, {4, 5, 1}};
        int src1 = 0;
        int src2 = 1;
        int dest = 5;
        long expected = 9;
        var result = solution.minimumWeight(n, edges, src1, src2, dest);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1, 1}, {2, 1, 1}};
        int src1 = 0;
        int src2 = 1;
        int dest = 2;
        long expected = -1;
        var result = solution.minimumWeight(n, edges, src1, src2, dest);
        assertThat(result).isEqualTo(expected);
    }

}
