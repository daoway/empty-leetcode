package com.blogspot.ostas.leetcode.all.hard.cat_and_mouse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
    Output: 0
    Example 2:
    Input: graph = [[1,3],[0],[3],[0,2]]
    Output: 1
      Constraints:
    3 <= graph.length <= 50
    1 <= graph[i].length < graph.length
    0 <= graph[i][j] < graph.length
    graph[i][j] != i
    graph[i] is unique.
    The mouse and the cat can always move.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] graph = new int[][]{{2, 5}, {3}, {0, 4, 5}, {1, 4, 5}, {2, 3}, {0, 2, 3}};
        int expected = 0;
        var result = solution.catMouseGame(graph);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] graph = new int[][]{{1, 3}, {0}, {3}, {0, 2}};
        int expected = 1;
        var result = solution.catMouseGame(graph);
        assertThat(result).isEqualTo(expected);
    }

}
