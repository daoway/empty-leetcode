package com.blogspot.ostas.leetcode.all.medium.shortest_unsorted_continuous_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,6,4,8,10,9,15]
    Output: 5
    Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 0
    Example 3:
    Input: nums = [1]
    Output: 0
      Constraints:
    1 <= nums.length <= 104
    -105 <= nums[i] <= 105
      Follow up: Can you solve it in O(n) time complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        int expected = 5;
        var result = solution.findUnsortedSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 0;
        var result = solution.findUnsortedSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int expected = 0;
        var result = solution.findUnsortedSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
