package com.blogspot.ostas.leetcode.all.medium.split_array_into_consecutive_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,3,4,5]
    Output: true
    Explanation: nums can be split into the following subsequences:
    [1,2,3,3,4,5] --> 1, 2, 3
    [1,2,3,3,4,5] --> 3, 4, 5
    Example 2:
    Input: nums = [1,2,3,3,4,4,5,5]
    Output: true
    Explanation: nums can be split into the following subsequences:
    [1,2,3,3,4,4,5,5] --> 1, 2, 3, 4, 5
    [1,2,3,3,4,4,5,5] --> 3, 4, 5
    Example 3:
    Input: nums = [1,2,3,4,4,5]
    Output: false
    Explanation: It is impossible to split nums into consecutive increasing subsequences of length 3 or more.
      Constraints:
    1 <= nums.length <= 104
    -1000 <= nums[i] <= 1000
    nums is sorted in non-decreasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 3, 4, 5};
        boolean expected = true;
        var result = solution.isPossible(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 3, 4, 4, 5, 5};
        boolean expected = true;
        var result = solution.isPossible(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 4, 5};
        boolean expected = false;
        var result = solution.isPossible(nums);
        assertThat(result).isEqualTo(expected);
    }

}
