package com.blogspot.ostas.leetcode.all.hard.find_the_k_sum_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,4,-2], k = 5
    Output: 2
    Explanation: All the possible subsequence sums that we can obtain are the following sorted in decreasing order:
    - 6, 4, 4, 2, 2, 0, 0, -2.
    The 5-Sum of the array is 2.
    Example 2:
    Input: nums = [1,-2,3,4,-10,12], k = 16
    Output: 10
    Explanation: The 16-Sum of the array is 10.
      Constraints:
    n == nums.length
    1 <= n <= 105
    -109 <= nums[i] <= 109
    1 <= k <= min(2000, 2n)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, -2};
        int k = 5;
        long expected = 2;
        var result = solution.kSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, -2, 3, 4, -10, 12};
        int k = 16;
        long expected = 10;
        var result = solution.kSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
