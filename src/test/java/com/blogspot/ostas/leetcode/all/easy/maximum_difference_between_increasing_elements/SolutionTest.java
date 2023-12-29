package com.blogspot.ostas.leetcode.all.easy.maximum_difference_between_increasing_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [7,1,5,4]
    Output: 4
    Explanation:
    The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
    Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
    Example 2:
    Input: nums = [9,4,3,2]
    Output: -1
    Explanation:
    There is no i and j such that i < j and nums[i] < nums[j].
    Example 3:
    Input: nums = [1,5,2,10]
    Output: 9
    Explanation:
    The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.
      Constraints:
    n == nums.length
    2 <= n <= 1000
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{7, 1, 5, 4};
        int expected = 4;
        var result = solution.maximumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{9, 4, 3, 2};
        int expected = -1;
        var result = solution.maximumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 2, 10};
        int expected = 9;
        var result = solution.maximumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

}
