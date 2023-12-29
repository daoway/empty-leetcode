package com.blogspot.ostas.leetcode.all.hard.maximum_sum_of_three_non_overlapping_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1,2,6,7,5,1], k = 2
    Output: [0,3,5]
    Explanation: Subarrays [1, 2], [2, 6], [7, 5] correspond to the starting indices [0, 3, 5].
    We could have also taken [2, 1], but an answer of [1, 3, 5] would be lexicographically larger.
    Example 2:
    Input: nums = [1,2,1,2,1,2,1,2,1], k = 2
    Output: [0,2,4]
      Constraints:
    1 <= nums.length <= 2 * 104
    1 <= nums[i] < 216
    1 <= k <= floor(nums.length / 3)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 6, 7, 5, 1};
        int k = 2;
        int[] expected = new int[]{0, 3, 5};
        var result = solution.maxSumOfThreeSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1};
        int k = 2;
        int[] expected = new int[]{0, 2, 4};
        var result = solution.maxSumOfThreeSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
