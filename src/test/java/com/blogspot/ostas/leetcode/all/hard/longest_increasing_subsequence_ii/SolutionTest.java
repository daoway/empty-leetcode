package com.blogspot.ostas.leetcode.all.hard.longest_increasing_subsequence_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,2,1,4,3,4,5,8,15], k = 3
    Output: 5
    Explanation:
    The longest subsequence that meets the requirements is [1,3,4,5,8].
    The subsequence has a length of 5, so we return 5.
    Note that the subsequence [1,3,4,5,8,15] does not meet the requirements because 15 - 8 = 7 is larger than 3.
    Example 2:
    Input: nums = [7,4,5,1,8,12,4,7], k = 5
    Output: 4
    Explanation:
    The longest subsequence that meets the requirements is [4,5,8,12].
    The subsequence has a length of 4, so we return 4.
    Example 3:
    Input: nums = [1,5], k = 1
    Output: 1
    Explanation:
    The longest subsequence that meets the requirements is [1].
    The subsequence has a length of 1, so we return 1.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i], k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 1, 4, 3, 4, 5, 8, 15};
        int k = 3;
        int expected = 5;
        var result = solution.lengthOfLIS(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{7, 4, 5, 1, 8, 12, 4, 7};
        int k = 5;
        int expected = 4;
        var result = solution.lengthOfLIS(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5};
        int k = 1;
        int expected = 1;
        var result = solution.lengthOfLIS(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
