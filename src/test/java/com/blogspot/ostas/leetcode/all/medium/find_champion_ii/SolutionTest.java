package com.blogspot.ostas.leetcode.all.medium.find_champion_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, edges = [[0,1],[1,2]]
    Output: 0
    Explanation: Team 1 is weaker than team 0. Team 2 is weaker than team 1. So the champion is team 0.
    Example 2:
    Input: n = 4, edges = [[0,2],[1,3],[1,2]]
    Output: -1
    Explanation: Team 2 is weaker than team 0 and team 1. Team 3 is weaker than team 1. But team 1 and team 0 are not weaker than any other teams. So the answer is -1.
      Constraints:
    1 <= n <= 100
    m == edges.length
    0 <= m <= n * (n - 1) / 2
    edges[i].length == 2
    0 <= edge[i][j] <= n - 1
    edges[i][0] != edges[i][1]
    The input is generated such that if team a is stronger than team b, team b is not stronger than team a.
    The input is generated such that if team a is stronger than team b and team b is stronger than team c, then team a is stronger than team c.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {1, 2}};
        int expected = 0;
        var result = solution.findChampion(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int[][] edges = new int[][]{{0, 2}, {1, 3}, {1, 2}};
        int expected = -1;
        var result = solution.findChampion(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
