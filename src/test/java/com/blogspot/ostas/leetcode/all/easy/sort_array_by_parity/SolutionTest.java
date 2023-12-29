package com.blogspot.ostas.leetcode.all.easy.sort_array_by_parity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,2,4]
    Output: [2,4,3,1]
    Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
    Example 2:
    Input: nums = [0]
    Output: [0]
      Constraints:
    1 <= nums.length <= 5000
    0 <= nums[i] <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 2, 4};
        int[] expected1 = new int[]{2, 4, 3, 1};
        int[] expected2 = new int[]{2, 4, 1, 3};
        int[] expected3 = new int[]{4, 2, 1, 3};
        var result = solution.sortArrayByParity(nums);
        assertThat(result).isIn(expected1, expected2, expected3);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0};
        int[] expected = new int[]{0};
        var result = solution.sortArrayByParity(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{0, 2};
        int[] expected = new int[]{0, 2};
        var result = solution.sortArrayByParity(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_3() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1};
        int[] expected = new int[]{0, 1};
        var result = solution.sortArrayByParity(nums);
        assertThat(result).isEqualTo(expected);
    }
}
