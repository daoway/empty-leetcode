package com.blogspot.ostas.leetcode.all.hard.minimize_deviation_in_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4]
    Output: 1
    Explanation: You can transform the array to [1,2,3,2], then to [2,2,3,2], then the deviation will be 3 - 2 = 1.
    Example 2:
    Input: nums = [4,1,5,20,3]
    Output: 3
    Explanation: You can transform the array after two operations to [4,2,5,5,3], then the deviation will be 5 - 2 = 3.
    Example 3:
    Input: nums = [2,10,8]
    Output: 3
      Constraints:
    n == nums.length
    2 <= n <= 5 * 104
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 1;
        var result = solution.minimumDeviation(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 1, 5, 20, 3};
        int expected = 3;
        var result = solution.minimumDeviation(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 10, 8};
        int expected = 3;
        var result = solution.minimumDeviation(nums);
        assertThat(result).isEqualTo(expected);
    }

}
