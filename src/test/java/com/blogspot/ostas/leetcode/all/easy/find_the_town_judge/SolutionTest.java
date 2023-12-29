package com.blogspot.ostas.leetcode.all.easy.find_the_town_judge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, trust = [[1,2]]
    Output: 2
    Example 2:
    Input: n = 3, trust = [[1,3],[2,3]]
    Output: 3
    Example 3:
    Input: n = 3, trust = [[1,3],[2,3],[3,1]]
    Output: -1
      Constraints:
    1 <= n <= 1000
    0 <= trust.length <= 104
    trust[i].length == 2
    All the pairs of trust are unique.
    ai != bi
    1 <= ai, bi <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[][] trust = new int[][]{{1, 2}};
        int expected = 2;
        var result = solution.findJudge(n, trust);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] trust = new int[][]{{1, 3}, {2, 3}};
        int expected = 3;
        var result = solution.findJudge(n, trust);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int[][] trust = new int[][]{{1, 3}, {2, 3}, {3, 1}};
        int expected = -1;
        var result = solution.findJudge(n, trust);
        assertThat(result).isEqualTo(expected);
    }

}
