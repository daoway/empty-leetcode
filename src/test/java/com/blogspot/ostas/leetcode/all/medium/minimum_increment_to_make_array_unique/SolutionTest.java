package com.blogspot.ostas.leetcode.all.medium.minimum_increment_to_make_array_unique;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,2]
    Output: 1
    Explanation: After 1 move, the array could be [1, 2, 3].
    Example 2:
    Input: nums = [3,2,1,2,1,7]
    Output: 6
    Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
    It can be shown with 5 or less moves that it is impossible for the array to have all unique values.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2};
        int expected = 1;
        var result = solution.minIncrementForUnique(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 2, 1, 7};
        int expected = 6;
        var result = solution.minIncrementForUnique(nums);
        assertThat(result).isEqualTo(expected);
    }

}
