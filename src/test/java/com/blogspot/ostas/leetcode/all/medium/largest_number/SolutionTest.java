package com.blogspot.ostas.leetcode.all.medium.largest_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,2]
    Output: "210"
    Example 2:
    Input: nums = [3,30,34,5,9]
    Output: "9534330"
      Constraints:
    1 <= nums.length <= 100
    0 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 2};
        String expected = "210";
        var result = solution.largestNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 30, 34, 5, 9};
        String expected = "9534330";
        var result = solution.largestNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

}
