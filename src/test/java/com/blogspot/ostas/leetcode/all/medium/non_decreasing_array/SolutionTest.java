package com.blogspot.ostas.leetcode.all.medium.non_decreasing_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,2,3]
    Output: true
    Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
    Example 2:
    Input: nums = [4,2,1]
    Output: false
    Explanation: You cannot get a non-decreasing array by modifying at most one element.
      Constraints:
    n == nums.length
    1 <= n <= 104
    -105 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 3};
        boolean expected = true;
        var result = solution.checkPossibility(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 1};
        boolean expected = false;
        var result = solution.checkPossibility(nums);
        assertThat(result).isEqualTo(expected);
    }

}
