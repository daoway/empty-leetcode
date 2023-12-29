package com.blogspot.ostas.leetcode.all.medium.diagonal_traverse_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [1,4,2,7,5,3,8,6,9]
    Example 2:
    Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
    Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i].length <= 105
    1 <= sum(nums[i].length) <= 105
    1 <= nums[i][j] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> nums = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        int[] expected = new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9};
        var result = solution.findDiagonalOrder(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> nums =
                List.of(List.of(1, 2, 3, 4, 5), List.of(6, 7), List.of(8), List.of(9, 10, 11),
                        List.of(12, 13, 14, 15, 16));
        int[] expected = new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16};
        var result = solution.findDiagonalOrder(nums);
        assertThat(result).isEqualTo(expected);
    }

}
