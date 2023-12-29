package com.blogspot.ostas.leetcode.all.easy.majority_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,3]
    Output: 3
    Example 2:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
      Constraints:
    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109
      Follow-up: Could you solve the problem in linear time and in O(1) space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 3};
        int expected = 3;
        var result = solution.majorityElement(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        var result = solution.majorityElement(nums);
        assertThat(result).isEqualTo(expected);
    }

}
