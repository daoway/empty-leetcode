package com.blogspot.ostas.leetcode.all.medium.minimum_absolute_difference_between_elements_with_constraint;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,2,4], x = 2
    Output: 0
    Explanation: We can select nums[0] = 4 and nums[3] = 4.
    They are at least 2 indices apart, and their absolute difference is the minimum, 0.
    It can be shown that 0 is the optimal answer.
    Example 2:
    Input: nums = [5,3,2,10,15], x = 1
    Output: 1
    Explanation: We can select nums[1] = 3 and nums[2] = 2.
    They are at least 1 index apart, and their absolute difference is the minimum, 1.
    It can be shown that 1 is the optimal answer.
    Example 3:
    Input: nums = [1,2,3,4], x = 3
    Output: 3
    Explanation: We can select nums[0] = 1 and nums[3] = 4.
    They are at least 3 indices apart, and their absolute difference is the minimum, 3.
    It can be shown that 3 is the optimal answer.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    0 <= x < nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(4, 3, 2, 4);
        int x = 2;
        int expected = 0;
        var result = solution.minAbsoluteDifference(nums, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(5, 3, 2, 10, 15);
        int x = 1;
        int expected = 1;
        var result = solution.minAbsoluteDifference(nums, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 2, 3, 4);
        int x = 3;
        int expected = 3;
        var result = solution.minAbsoluteDifference(nums, x);
        assertThat(result).isEqualTo(expected);
    }

}
