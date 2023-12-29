package com.blogspot.ostas.leetcode.all.easy.number_of_equivalent_domino_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
    Output: 1
    Example 2:
    Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
    Output: 3
      Constraints:
    1 <= dominoes.length <= 4 * 104
    dominoes[i].length == 2
    1 <= dominoes[i][j] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] dominoes = new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        int expected = 1;
        var result = solution.numEquivDominoPairs(dominoes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] dominoes = new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        int expected = 3;
        var result = solution.numEquivDominoPairs(dominoes);
        assertThat(result).isEqualTo(expected);
    }

}
