package com.blogspot.ostas.leetcode.all.easy.neither_minimum_nor_maximum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,1,4]
    Output: 2
    Explanation: In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.
    Example 2:
    Input: nums = [1,2]
    Output: -1
    Explanation: Since there is no number in nums that is neither the maximum nor the minimum, we cannot select a number that satisfies the given condition. Therefore, there is no answer.
    Example 3:
    Input: nums = [2,1,3]
    Output: 2
    Explanation: Since 2 is neither the maximum nor the minimum value in nums, it is the only valid answer.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
    All values in nums are distinct
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 4};
        int expected = 2;
        var result = solution.findNonMinOrMax(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2};
        int expected = -1;
        var result = solution.findNonMinOrMax(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 3};
        int expected = 2;
        var result = solution.findNonMinOrMax(nums);
        assertThat(result).isEqualTo(expected);
    }

}
