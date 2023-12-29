package com.blogspot.ostas.leetcode.all.medium.find_triangular_sum_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5]
    Output: 8
    Explanation:
    The above diagram depicts the process from which we obtain the triangular sum of the array.
    Example 2:
    Input: nums = [5]
    Output: 5
    Explanation:
    Since there is only one element in nums, the triangular sum is the value of that element itself.
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int expected = 8;
        var result = solution.triangularSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5};
        int expected = 5;
        var result = solution.triangularSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
