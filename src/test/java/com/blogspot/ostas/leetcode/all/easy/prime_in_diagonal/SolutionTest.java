package com.blogspot.ostas.leetcode.all.easy.prime_in_diagonal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [[1,2,3],[5,6,7],[9,10,11]]
    Output: 11
    Explanation: The numbers 1, 3, 6, 9, and 11 are the only numbers present on at least one of the diagonals. Since 11 is the largest prime, we return 11.
    Example 2:
    Input: nums = [[1,2,3],[5,17,7],[9,11,10]]
    Output: 17
    Explanation: The numbers 1, 3, 9, 10, and 17 are all present on at least one of the diagonals. 17 is the largest prime, so we return 17.
      Constraints:
    1 <= nums.length <= 300
    nums.length == numsi.length
    1 <= nums[i][j] <= 4*106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] nums = new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        int expected = 11;
        var result = solution.diagonalPrime(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] nums = new int[][]{{1, 2, 3}, {5, 17, 7}, {9, 11, 10}};
        int expected = 17;
        var result = solution.diagonalPrime(nums);
        assertThat(result).isEqualTo(expected);
    }

}
