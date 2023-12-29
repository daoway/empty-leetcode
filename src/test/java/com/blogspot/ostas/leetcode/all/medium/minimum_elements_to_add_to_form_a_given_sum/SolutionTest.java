package com.blogspot.ostas.leetcode.all.medium.minimum_elements_to_add_to_form_a_given_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,-1,1], limit = 3, goal = -4
    Output: 2
    Explanation: You can add -2 and -3, then the sum of the array will be 1 - 1 + 1 - 2 - 3 = -4.
    Example 2:
    Input: nums = [1,-10,9,1], limit = 100, goal = 0
    Output: 1
      Constraints:
    1 <= nums.length <= 105
    1 <= limit <= 106
    -limit <= nums[i] <= limit
    -109 <= goal <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, -1, 1};
        int limit = 3;
        int goal = -4;
        int expected = 2;
        var result = solution.minElements(nums, limit, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, -10, 9, 1};
        int limit = 100;
        int goal = 0;
        int expected = 1;
        var result = solution.minElements(nums, limit, goal);
        assertThat(result).isEqualTo(expected);
    }

}
