package com.blogspot.ostas.leetcode.all.medium.possible_bipartition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, dislikes = [[1,2],[1,3],[2,4]]
    Output: true
    Explanation: The first group has [1,4], and the second group has [2,3].
    Example 2:
    Input: n = 3, dislikes = [[1,2],[1,3],[2,3]]
    Output: false
    Explanation: We need at least 3 groups to divide them. We cannot put them in two groups.
      Constraints:
    1 <= n <= 2000
    0 <= dislikes.length <= 104
    dislikes[i].length == 2
    1 <= ai < bi <= n
    All the pairs of dislikes are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] dislikes = new int[][]{{1, 2}, {1, 3}, {2, 4}};
        boolean expected = true;
        var result = solution.possibleBipartition(n, dislikes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] dislikes = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        boolean expected = false;
        var result = solution.possibleBipartition(n, dislikes);
        assertThat(result).isEqualTo(expected);
    }

}
