package com.blogspot.ostas.leetcode.all.medium.longest_subarray_of_one_s_after_deleting_one_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,0,1]
    Output: 3
    Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
    Example 2:
    Input: nums = [0,1,1,1,0,1,1,0,1]
    Output: 5
    Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
    Example 3:
    Input: nums = [1,1,1]
    Output: 2
    Explanation: You must delete one element.
      Constraints:
    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 0, 1};
        int expected = 3;
        var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
        int expected = 5;
        var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int expected = 2;
        var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
