package com.blogspot.ostas.leetcode.all.medium.single_number_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1,3,2,5]
    Output: [3,5]
    Explanation:  [5, 3] is also a valid answer.
    Example 2:
    Input: nums = [-1,0]
    Output: [-1,0]
    Example 3:
    Input: nums = [0,1]
    Output: [1,0]
      Constraints:
    2 <= nums.length <= 3 * 104
    -231 <= nums[i] <= 231 - 1
    Each integer in nums will appear twice, only two integers will appear once.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] expected = new int[]{3, 5};
        var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 0};
        int[] expected = new int[]{-1, 0};
        var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1};
        int[] expected = new int[]{1, 0};
        var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

}
