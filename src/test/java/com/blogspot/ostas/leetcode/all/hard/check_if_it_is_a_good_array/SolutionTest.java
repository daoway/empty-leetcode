package com.blogspot.ostas.leetcode.all.hard.check_if_it_is_a_good_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [12,5,7,23]
    Output: true
    Explanation: Pick numbers 5 and 7.
    5*3 + 7*(-2) = 1
    Example 2:
    Input: nums = [29,6,10]
    Output: true
    Explanation: Pick numbers 29, 6 and 10.
    29*1 + 6*(-3) + 10*(-1) = 1
    Example 3:
    Input: nums = [3,6]
    Output: false
      Constraints:
    1 <= nums.length <= 10^5
    1 <= nums[i] <= 10^9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{12, 5, 7, 23};
        boolean expected = true;
        var result = solution.isGoodArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{29, 6, 10};
        boolean expected = true;
        var result = solution.isGoodArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 6};
        boolean expected = false;
        var result = solution.isGoodArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
