package com.blogspot.ostas.leetcode.all.medium.restore_the_array_from_adjacent_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: adjacentPairs = [[2,1],[3,4],[3,2]]
    Output: [1,2,3,4]
    Explanation: This array has all its adjacent pairs in adjacentPairs.
    Notice that adjacentPairs[i] may not be in left-to-right order.
    Example 2:
    Input: adjacentPairs = [[4,-2],[1,4],[-3,1]]
    Output: [-2,4,1,-3]
    Explanation: There can be negative numbers.
    Another solution is [-3,1,4,-2], which would also be accepted.
    Example 3:
    Input: adjacentPairs = [[100000,-100000]]
    Output: [100000,-100000]
      Constraints:
    nums.length == n
    adjacentPairs.length == n - 1
    adjacentPairs[i].length == 2
    2 <= n <= 105
    -105 <= nums[i], ui, vi <= 105
    There exists some nums that has adjacentPairs as its pairs.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] adjacentPairs = new int[][]{{2, 1}, {3, 4}, {3, 2}};
        int[] expected = new int[]{1, 2, 3, 4};
        var result = solution.restoreArray(adjacentPairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] adjacentPairs = new int[][]{{4, -2}, {1, 4}, {-3, 1}};
        int[] expected = new int[]{-2, 4, 1, -3};
        var result = solution.restoreArray(adjacentPairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] adjacentPairs = new int[][]{{100000, -100000}};
        int[] expected = new int[]{100000, -100000};
        var result = solution.restoreArray(adjacentPairs);
        assertThat(result).isEqualTo(expected);
    }

}
