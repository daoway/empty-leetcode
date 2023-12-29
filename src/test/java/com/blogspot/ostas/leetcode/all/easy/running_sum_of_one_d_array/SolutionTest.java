package com.blogspot.ostas.leetcode.all.easy.running_sum_of_one_d_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    Example 2:
    Input: nums = [1,1,1,1,1]
    Output: [1,2,3,4,5]
    Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
    Example 3:
    Input: nums = [3,1,2,10,1]
    Output: [3,4,6,16,17]
      Constraints:
    1 <= nums.length <= 1000
    -10^6 <= nums[i] <= 10^6
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};
        var result = solution.runningSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        var result = solution.runningSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 2, 10, 1};
        int[] expected = new int[]{3, 4, 6, 16, 17};
        var result = solution.runningSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
