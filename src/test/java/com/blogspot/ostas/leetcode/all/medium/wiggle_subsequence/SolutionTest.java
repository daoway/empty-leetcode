package com.blogspot.ostas.leetcode.all.medium.wiggle_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,7,4,9,2,5]
    Output: 6
    Explanation: The entire sequence is a wiggle sequence with differences (6, -3, 5, -7, 3).
    Example 2:
    Input: nums = [1,17,5,10,13,15,10,5,16,8]
    Output: 7
    Explanation: There are several subsequences that achieve this length.
    One is [1, 17, 10, 13, 10, 16, 8] with differences (16, -7, 3, -3, 6, -8).
    Example 3:
    Input: nums = [1,2,3,4,5,6,7,8,9]
    Output: 2
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] <= 1000
      Follow up: Could you solve this in O(n) time?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 7, 4, 9, 2, 5};
        int expected = 6;
        var result = solution.wiggleMaxLength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int expected = 7;
        var result = solution.wiggleMaxLength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected = 2;
        var result = solution.wiggleMaxLength(nums);
        assertThat(result).isEqualTo(expected);
    }

}
