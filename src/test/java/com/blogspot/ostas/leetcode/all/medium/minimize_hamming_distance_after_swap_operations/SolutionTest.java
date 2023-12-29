package com.blogspot.ostas.leetcode.all.medium.minimize_hamming_distance_after_swap_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: source = [1,2,3,4], target = [2,1,4,5], allowedSwaps = [[0,1],[2,3]]
    Output: 1
    Explanation: source can be transformed the following way:
    - Swap indices 0 and 1: source = [2,1,3,4]
    - Swap indices 2 and 3: source = [2,1,4,3]
    The Hamming distance of source and target is 1 as they differ in 1 position: index 3.
    Example 2:
    Input: source = [1,2,3,4], target = [1,3,2,4], allowedSwaps = []
    Output: 2
    Explanation: There are no allowed swaps.
    The Hamming distance of source and target is 2 as they differ in 2 positions: index 1 and index 2.
    Example 3:
    Input: source = [5,1,2,4,3], target = [1,5,4,2,3], allowedSwaps = [[0,4],[4,2],[1,3],[1,4]]
    Output: 0
      Constraints:
    n == source.length == target.length
    1 <= n <= 105
    1 <= source[i], target[i] <= 105
    0 <= allowedSwaps.length <= 105
    allowedSwaps[i].length == 2
    0 <= ai, bi <= n - 1
    ai != bi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] source = new int[]{1, 2, 3, 4};
        int[] target = new int[]{2, 1, 4, 5};
        int[][] allowedSwaps = new int[][]{{0, 1}, {2, 3}};
        int expected = 1;
        var result = solution.minimumHammingDistance(source, target, allowedSwaps);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] source = new int[]{1, 2, 3, 4};
        int[] target = new int[]{1, 3, 2, 4};
        int[][] allowedSwaps = new int[][]{};
        int expected = 2;
        var result = solution.minimumHammingDistance(source, target, allowedSwaps);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] source = new int[]{5, 1, 2, 4, 3};
        int[] target = new int[]{1, 5, 4, 2, 3};
        int[][] allowedSwaps = new int[][]{{0, 4}, {4, 2}, {1, 3}, {1, 4}};
        int expected = 0;
        var result = solution.minimumHammingDistance(source, target, allowedSwaps);
        assertThat(result).isEqualTo(expected);
    }

}
