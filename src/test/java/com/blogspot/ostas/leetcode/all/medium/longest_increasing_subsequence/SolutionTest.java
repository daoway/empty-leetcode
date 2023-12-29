package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,9,2,5,3,7,101,18]
    Output: 4
    Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
    Example 2:
    Input: nums = [0,1,0,3,2,3]
    Output: 4
    Example 3:
    Input: nums = [7,7,7,7,7,7,7]
    Output: 1
      Constraints:
    1 <= nums.length <= 2500
    -104 <= nums[i] <= 104
      Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        var result = solution.lengthOfLIS(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 0, 3, 2, 3};
        int expected = 4;
        var result = solution.lengthOfLIS(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        int expected = 1;
        var result = solution.lengthOfLIS(nums);
        assertThat(result).isEqualTo(expected);
    }

}
