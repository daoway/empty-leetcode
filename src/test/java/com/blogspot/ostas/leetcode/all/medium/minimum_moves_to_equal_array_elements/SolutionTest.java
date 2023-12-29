package com.blogspot.ostas.leetcode.all.medium.minimum_moves_to_equal_array_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3]
    Output: 3
    Explanation: Only three moves are needed (remember each move increments two elements):
    [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
    Example 2:
    Input: nums = [1,1,1]
    Output: 0
      Constraints:
    n == nums.length
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    The answer is guaranteed to fit in a 32-bit integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int expected = 3;
        var result = solution.minMoves(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int expected = 0;
        var result = solution.minMoves(nums);
        assertThat(result).isEqualTo(expected);
    }

}
