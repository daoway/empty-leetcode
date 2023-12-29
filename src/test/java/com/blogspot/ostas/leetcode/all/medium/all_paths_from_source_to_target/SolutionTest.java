package com.blogspot.ostas.leetcode.all.medium.all_paths_from_source_to_target;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: graph = [[1,2],[3],[3],[]]
    Output: [[0,1,3],[0,2,3]]
    Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
    Example 2:
    Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
    Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
      Constraints:
    n == graph.length
    2 <= n <= 15
    0 <= graph[i][j] < n
    graph[i][j] != i (i.e., there will be no self-loops).
    All the elements of graph[i] are unique.
    The input graph is guaranteed to be a DAG.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        List<List<Integer>> expected = List.of(List.of(0, 1, 3), List.of(0, 2, 3));
        var result = solution.allPathsSourceTarget(graph);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] graph = new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> expected = List.of(List.of(0, 4), List.of(0, 3, 4), List.of(0, 1, 3, 4),
                List.of(0, 1, 2, 3, 4), List.of(0, 1, 4));
        var result = solution.allPathsSourceTarget(graph);
        assertThat(result).isEqualTo(expected);
    }

}
