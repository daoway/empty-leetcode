package com.blogspot.ostas.leetcode.all.easy.find_subsequence_of_length_k_with_the_largest_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,3,3], k = 2
    Output: [3,3]
    Explanation:
    The subsequence has the largest sum of 3 + 3 = 6.
    Example 2:
    Input: nums = [-1,-2,3,4], k = 3
    Output: [-1,3,4]
    Explanation:
    The subsequence has the largest sum of -1 + 3 + 4 = 6.
    Example 3:
    Input: nums = [3,4,3,3], k = 2
    Output: [3,4]
    Explanation:
    The subsequence has the largest sum of 3 + 4 = 7.
    Another possible subsequence is [4, 3].
      Constraints:
    1 <= nums.length <= 1000
    -105 <= nums[i] <= 105
    1 <= k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 3, 3};
        int k = 2;
        int[] expected = new int[]{3, 3};
        var result = solution.maxSubsequence(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -2, 3, 4};
        int k = 3;
        int[] expected = new int[]{-1, 3, 4};
        var result = solution.maxSubsequence(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 4, 3, 3};
        int k = 2;
        int[] expected = new int[]{3, 4};
        var result = solution.maxSubsequence(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
