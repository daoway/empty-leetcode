package com.blogspot.ostas.leetcode.all.medium.largest_sum_of_averages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [9,1,2,3,9], k = 3
    Output: 20.00000
    Explanation:
    The best choice is to partition nums into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.
    We could have also partitioned nums into [9, 1], [2], [3, 9], for example.
    That partition would lead to a score of 5 + 2 + 6 = 13, which is worse.
    Example 2:
    Input: nums = [1,2,3,4,5,6,7], k = 4
    Output: 20.50000
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 104
    1 <= k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{9, 1, 2, 3, 9};
        int k = 3;
        double expected = 20.00000;
        var result = solution.largestSumOfAverages(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        double expected = 20.50000;
        var result = solution.largestSumOfAverages(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
