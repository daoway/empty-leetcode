package com.blogspot.ostas.leetcode.all.medium.queens_that_can_attack_the_king;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: queens = [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]], king = [0,0]
    Output: [[0,1],[1,0],[3,3]]
    Explanation: The diagram above shows the three queens that can directly attack the king and the three queens that cannot attack the king (i.e., marked with red dashes).
    Example 2:
    Input: queens = [[0,0],[1,1],[2,2],[3,4],[3,5],[4,4],[4,5]], king = [3,3]
    Output: [[2,2],[3,4],[4,4]]
    Explanation: The diagram above shows the three queens that can directly attack the king and the three queens that cannot attack the king (i.e., marked with red dashes).
      Constraints:
    1 <= queens.length < 64
    queens[i].length == king.length == 2
    0 <= xQueeni, yQueeni, xKing, yKing < 8
    All the given positions are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] queens = new int[][]{{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}};
        int[] king = new int[]{0, 0};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0), List.of(3, 3));
        var result = solution.queensAttacktheKing(queens, king);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] queens = new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 4}, {3, 5}, {4, 4}, {4, 5}};
        int[] king = new int[]{3, 3};
        List<List<Integer>> expected = List.of(List.of(2, 2), List.of(3, 4), List.of(4, 4));
        var result = solution.queensAttacktheKing(queens, king);
        assertThat(result).isEqualTo(expected);
    }

}
