package com.blogspot.ostas.leetcode.all.medium.decrease_elements_to_make_array_zigzag;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3]
    Output: 2
    Explanation: We can decrease 2 to 0 or 3 to 1.
    Example 2:
    Input: nums = [9,6,1,6,2]
    Output: 4
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int expected = 2;
        var result = solution.movesToMakeZigzag(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{9, 6, 1, 6, 2};
        int expected = 4;
        var result = solution.movesToMakeZigzag(nums);
        assertThat(result).isEqualTo(expected);
    }

}
