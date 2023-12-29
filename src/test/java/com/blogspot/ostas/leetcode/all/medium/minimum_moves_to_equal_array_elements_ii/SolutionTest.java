package com.blogspot.ostas.leetcode.all.medium.minimum_moves_to_equal_array_elements_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3]
    Output: 2
    Explanation:
    Only two moves are needed (remember each move increments or decrements one element):
    [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
    Example 2:
    Input: nums = [1,10,2,9]
    Output: 16
      Constraints:
    n == nums.length
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int expected = 2;
        var result = solution.minMoves2(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 10, 2, 9};
        int expected = 16;
        var result = solution.minMoves2(nums);
        assertThat(result).isEqualTo(expected);
    }

}
