package com.blogspot.ostas.leetcode.all.medium.divide_array_in_sets_of_k_consecutive_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,3,4,4,5,6], k = 4
    Output: true
    Explanation: Array can be divided into [1,2,3,4] and [3,4,5,6].
    Example 2:
    Input: nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
    Output: true
    Explanation: Array can be divided into [1,2,3] , [2,3,4] , [3,4,5] and [9,10,11].
    Example 3:
    Input: nums = [1,2,3,4], k = 3
    Output: false
    Explanation: Each array should be divided in subarrays of size 3.
      Constraints:
    1 <= k <= nums.length <= 105
    1 <= nums[i] <= 109
      Note: This question is the same as 846: https://leetcode.com/problems/hand-of-straights/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 3, 4, 4, 5, 6};
        int k = 4;
        boolean expected = true;
        var result = solution.isPossibleDivide(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11};
        int k = 3;
        boolean expected = true;
        var result = solution.isPossibleDivide(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 3;
        boolean expected = false;
        var result = solution.isPossibleDivide(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
