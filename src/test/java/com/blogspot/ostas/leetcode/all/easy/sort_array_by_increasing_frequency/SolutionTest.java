package com.blogspot.ostas.leetcode.all.easy.sort_array_by_increasing_frequency;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,2,2,2,3]
    Output: [3,1,1,2,2,2]
    Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
    Example 2:
    Input: nums = [2,3,1,3,2]
    Output: [1,3,3,2,2]
    Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
    Example 3:
    Input: nums = [-1,1,-6,4,5,-6,1,4,1]
    Output: [5,-1,4,4,-6,-6,1,1,1]
      Constraints:
    1 <= nums.length <= 100
    -100 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 2, 2, 3};
        int[] expected = new int[]{3, 1, 1, 2, 2, 2};
        var result = solution.frequencySort(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 3, 2};
        int[] expected = new int[]{1, 3, 3, 2, 2};
        var result = solution.frequencySort(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1};
        int[] expected = new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1};
        var result = solution.frequencySort(nums);
        assertThat(result).isEqualTo(expected);
    }

}
