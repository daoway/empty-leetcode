package com.blogspot.ostas.leetcode.all.easy.longest_harmonious_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,2,2,5,2,3,7]
    Output: 5
    Explanation: The longest harmonious subsequence is [3,2,2,2,3].
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 2
    Example 3:
    Input: nums = [1,1,1,1]
    Output: 0
      Constraints:
    1 <= nums.length <= 2 * 104
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        int expected = 5;
        var result = solution.findLHS(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 2;
        var result = solution.findLHS(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1};
        int expected = 0;
        var result = solution.findLHS(nums);
        assertThat(result).isEqualTo(expected);
    }

}
