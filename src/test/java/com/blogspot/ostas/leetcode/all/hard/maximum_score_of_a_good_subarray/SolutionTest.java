package com.blogspot.ostas.leetcode.all.hard.maximum_score_of_a_good_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,4,3,7,4,5], k = 3
    Output: 15
    Explanation: The optimal subarray is (1, 5) with a score of min(4,3,7,4,5) * (5-1+1) = 3 * 5 = 15.
    Example 2:
    Input: nums = [5,5,4,5,4,1,1,1], k = 0
    Output: 20
    Explanation: The optimal subarray is (0, 4) with a score of min(5,5,4,5,4) * (4-0+1) = 4 * 5 = 20.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 2 * 104
    0 <= k < nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 3, 7, 4, 5};
        int k = 3;
        int expected = 15;
        var result = solution.maximumScore(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 5, 4, 5, 4, 1, 1, 1};
        int k = 0;
        int expected = 20;
        var result = solution.maximumScore(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
