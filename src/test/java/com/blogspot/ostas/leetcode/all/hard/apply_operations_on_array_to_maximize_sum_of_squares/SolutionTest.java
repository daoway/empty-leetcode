package com.blogspot.ostas.leetcode.all.hard.apply_operations_on_array_to_maximize_sum_of_squares;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,6,5,8], k = 2
    Output: 261
    Explanation: We can do the following operations on the array:
    - Choose i = 0 and j = 3, then change nums[0] to (2 AND 8) = 0 and nums[3] to (2 OR 8) = 10. The resulting array is nums = [0,6,5,10].
    - Choose i = 2 and j = 3, then change nums[2] to (5 AND 10) = 0 and nums[3] to (5 OR 10) = 15. The resulting array is nums = [0,6,0,15].
    We can choose the elements 15 and 6 from the final array. The sum of squares is 152 + 62 = 261.
    It can be shown that this is the maximum value we can get.
    Example 2:
    Input: nums = [4,5,4,7], k = 3
    Output: 90
    Explanation: We do not need to apply any operations.
    We can choose the elements 7, 5, and 4 with a sum of squares: 72 + 52 + 42 = 90.
    It can be shown that this is the maximum value we can get.
      Constraints:
    1 <= k <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(2, 6, 5, 8);
        int k = 2;
        int expected = 261;
        var result = solution.maxSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(4, 5, 4, 7);
        int k = 3;
        int expected = 90;
        var result = solution.maxSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
