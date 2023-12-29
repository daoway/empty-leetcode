package com.blogspot.ostas.leetcode.all.medium.longest_arithmetic_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,6,9,12]
    Output: 4
    Explanation:  The whole array is an arithmetic sequence with steps of length = 3.
    Example 2:
    Input: nums = [9,4,7,2,10]
    Output: 3
    Explanation:  The longest arithmetic subsequence is [4,7,10].
    Example 3:
    Input: nums = [20,1,15,3,10,5,8]
    Output: 4
    Explanation:  The longest arithmetic subsequence is [20,15,10,5].
      Constraints:
    2 <= nums.length <= 1000
    0 <= nums[i] <= 500
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 6, 9, 12};
        int expected = 4;
        var result = solution.longestArithSeqLength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{9, 4, 7, 2, 10};
        int expected = 3;
        var result = solution.longestArithSeqLength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{20, 1, 15, 3, 10, 5, 8};
        int expected = 4;
        var result = solution.longestArithSeqLength(nums);
        assertThat(result).isEqualTo(expected);
    }

}
