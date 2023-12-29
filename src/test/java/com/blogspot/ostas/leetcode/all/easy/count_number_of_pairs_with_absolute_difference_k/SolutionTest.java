package com.blogspot.ostas.leetcode.all.easy.count_number_of_pairs_with_absolute_difference_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,2,1], k = 1
    Output: 4
    Explanation: The pairs with an absolute difference of 1 are:
    - [1,2,2,1]
    - [1,2,2,1]
    - [1,2,2,1]
    - [1,2,2,1]
    Example 2:
    Input: nums = [1,3], k = 3
    Output: 0
    Explanation: There are no pairs with an absolute difference of 3.
    Example 3:
    Input: nums = [3,2,1,5,4], k = 2
    Output: 3
    Explanation: The pairs with an absolute difference of 2 are:
    - [3,2,1,5,4]
    - [3,2,1,5,4]
    - [3,2,1,5,4]
      Constraints:
    1 <= nums.length <= 200
    1 <= nums[i] <= 100
    1 <= k <= 99
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 1};
        int k = 1;
        int expected = 4;
        var result = solution.countKDifference(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3};
        int k = 3;
        int expected = 0;
        var result = solution.countKDifference(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 5, 4};
        int k = 2;
        int expected = 3;
        var result = solution.countKDifference(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
