package com.blogspot.ostas.leetcode.all.easy.largest_number_at_least_twice_of_others;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,6,1,0]
    Output: 1
    Explanation: 6 is the largest integer.
    For every other number in the array x, 6 is at least twice as big as x.
    The index of value 6 is 1, so we return 1.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: -1
    Explanation: 4 is less than twice the value of 3, so we return -1.
      Constraints:
    2 <= nums.length <= 50
    0 <= nums[i] <= 100
    The largest element in nums is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 6, 1, 0};
        int expected = 1;
        var result = solution.dominantIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = -1;
        var result = solution.dominantIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

}
