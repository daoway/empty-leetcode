package com.blogspot.ostas.leetcode.all.hard.maximum_balanced_subsequence_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,3,5,6]
    Output: 14
    Explanation: In this example, the subsequence [3,5,6] consisting of indices 0, 2, and 3 can be selected.
    nums[2] - nums[0] >= 2 - 0.
    nums[3] - nums[2] >= 3 - 2.
    Hence, it is a balanced subsequence, and its sum is the maximum among the balanced subsequences of nums.
    The subsequence consisting of indices 1, 2, and 3 is also valid.
    It can be shown that it is not possible to get a balanced subsequence with a sum greater than 14.
    Example 2:
    Input: nums = [5,-1,-3,8]
    Output: 13
    Explanation: In this example, the subsequence [5,8] consisting of indices 0 and 3 can be selected.
    nums[3] - nums[0] >= 3 - 0.
    Hence, it is a balanced subsequence, and its sum is the maximum among the balanced subsequences of nums.
    It can be shown that it is not possible to get a balanced subsequence with a sum greater than 13.
    Example 3:
    Input: nums = [-2,-1]
    Output: -1
    Explanation: In this example, the subsequence [-1] can be selected.
    It is a balanced subsequence, and its sum is the maximum among the balanced subsequences of nums.
      Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 3, 5, 6};
        long expected = 14;
        var result = solution.maxBalancedSubsequenceSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, -1, -3, 8};
        long expected = 13;
        var result = solution.maxBalancedSubsequenceSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-2, -1};
        long expected = -1;
        var result = solution.maxBalancedSubsequenceSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
