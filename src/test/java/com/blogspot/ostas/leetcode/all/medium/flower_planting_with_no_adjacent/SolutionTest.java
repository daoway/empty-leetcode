package com.blogspot.ostas.leetcode.all.medium.flower_planting_with_no_adjacent;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, paths = [[1,2],[2,3],[3,1]]
    Output: [1,2,3]
    Explanation:
    Gardens 1 and 2 have different types.
    Gardens 2 and 3 have different types.
    Gardens 3 and 1 have different types.
    Hence, [1,2,3] is a valid answer. Other valid answers include [1,2,4], [1,4,2], and [3,2,1].
    Example 2:
    Input: n = 4, paths = [[1,2],[3,4]]
    Output: [1,2,1,2]
    Example 3:
    Input: n = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
    Output: [1,2,3,4]
      Constraints:
    1 <= n <= 104
    0 <= paths.length <= 2 * 104
    paths[i].length == 2
    1 <= xi, yi <= n
    xi != yi
    Every garden has at most 3 paths coming into or leaving it.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] paths = new int[][]{{1, 2}, {2, 3}, {3, 1}};
        int[] expected = new int[]{1, 2, 3};
        var result = solution.gardenNoAdj(n, paths);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int[][] paths = new int[][]{{1, 2}, {3, 4}};
        int[] expected = new int[]{1, 2, 1, 2};
        var result = solution.gardenNoAdj(n, paths);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int[][] paths = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 3}, {2, 4}};
        int[] expected = new int[]{1, 2, 3, 4};
        var result = solution.gardenNoAdj(n, paths);
        assertThat(result).isEqualTo(expected);
    }

}
