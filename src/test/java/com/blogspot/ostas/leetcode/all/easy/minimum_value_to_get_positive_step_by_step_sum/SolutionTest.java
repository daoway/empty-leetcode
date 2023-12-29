package com.blogspot.ostas.leetcode.all.easy.minimum_value_to_get_positive_step_by_step_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-3,2,-3,4,2]
    Output: 5
    Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
    step by step sum
    startValue = 4 | startValue = 5 | nums
      (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
      (1 +2 ) = 3  | (2 +2 ) = 4    |   2
      (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
      (0 +4 ) = 4  | (1 +4 ) = 5    |   4
      (4 +2 ) = 6  | (5 +2 ) = 7    |   2
    Example 2:
    Input: nums = [1,2]
    Output: 1
    Explanation: Minimum start value should be positive.
    Example 3:
    Input: nums = [1,-2,-3]
    Output: 5
      Constraints:
    1 <= nums.length <= 100
    -100 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-3, 2, -3, 4, 2};
        int expected = 5;
        var result = solution.minStartValue(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2};
        int expected = 1;
        var result = solution.minStartValue(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, -2, -3};
        int expected = 5;
        var result = solution.minStartValue(nums);
        assertThat(result).isEqualTo(expected);
    }

}
