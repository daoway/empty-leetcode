package com.blogspot.ostas.leetcode.all.medium.k_diff_pairs_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,4,1,5], k = 2
    Output: 2
    Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
    Although we have two 1s in the input, we should only return the number of unique pairs.
    Example 2:
    Input: nums = [1,2,3,4,5], k = 1
    Output: 4
    Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
    Example 3:
    Input: nums = [1,3,1,5,4], k = 0
    Output: 1
    Explanation: There is one 0-diff pair in the array, (1, 1).
      Constraints:
    1 <= nums.length <= 104
    -107 <= nums[i] <= 107
    0 <= k <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 4, 1, 5};
        int k = 2;
        int expected = 2;
        var result = solution.findPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 1;
        int expected = 4;
        var result = solution.findPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 1, 5, 4};
        int k = 0;
        int expected = 1;
        var result = solution.findPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
