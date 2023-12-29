package com.blogspot.ostas.leetcode.all.hard.add_edges_to_make_degrees_of_all_nodes_even;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, edges = [[1,2],[2,3],[3,4],[4,2],[1,4],[2,5]]
    Output: true
    Explanation: The above diagram shows a valid way of adding an edge.
    Every node in the resulting graph is connected to an even number of edges.
    Example 2:
    Input: n = 4, edges = [[1,2],[3,4]]
    Output: true
    Explanation: The above diagram shows a valid way of adding two edges.
    Example 3:
    Input: n = 4, edges = [[1,2],[1,3],[1,4]]
    Output: false
    Explanation: It is not possible to obtain a valid graph with adding at most 2 edges.
      Constraints:
    3 <= n <= 105
    2 <= edges.length <= 105
    edges[i].length == 2
    1 <= ai, bi <= n
    ai != bi
    There are no repeated edges.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        List<List<Integer>> edges =
                List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4), List.of(4, 2), List.of(1, 4),
                        List.of(2, 5));
        boolean expected = true;
        var result = solution.isPossible(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        List<List<Integer>> edges = List.of(List.of(1, 2), List.of(3, 4));
        boolean expected = true;
        var result = solution.isPossible(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        List<List<Integer>> edges = List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4));
        boolean expected = false;
        var result = solution.isPossible(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
