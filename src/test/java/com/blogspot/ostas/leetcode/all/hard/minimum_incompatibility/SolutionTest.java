package com.blogspot.ostas.leetcode.all.hard.minimum_incompatibility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1,4], k = 2
    Output: 4
    Explanation: The optimal distribution of subsets is [1,2] and [1,4].
    The incompatibility is (2-1) + (4-1) = 4.
    Note that [1,1] and [2,4] would result in a smaller sum, but the first subset contains 2 equal elements.
    Example 2:
    Input: nums = [6,3,8,1,3,1,2,2], k = 4
    Output: 6
    Explanation: The optimal distribution of subsets is [1,2], [2,3], [6,8], and [1,3].
    The incompatibility is (2-1) + (3-2) + (8-6) + (3-1) = 6.
    Example 3:
    Input: nums = [5,3,3,6,3,3], k = 3
    Output: -1
    Explanation: It is impossible to distribute nums into 3 subsets where no two elements are equal in the same subset.
      Constraints:
    1 <= k <= nums.length <= 16
    nums.length is divisible by k
    1 <= nums[i] <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 4};
        int k = 2;
        int expected = 4;
        var result = solution.minimumIncompatibility(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 3, 8, 1, 3, 1, 2, 2};
        int k = 4;
        int expected = 6;
        var result = solution.minimumIncompatibility(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{5, 3, 3, 6, 3, 3};
        int k = 3;
        int expected = -1;
        var result = solution.minimumIncompatibility(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
