package com.blogspot.ostas.leetcode.all.medium.longest_square_streak_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,6,16,8,2]
    Output: 3
    Explanation: Choose the subsequence [4,16,2]. After sorting it, it becomes [2,4,16].
    - 4 = 2 * 2.
    - 16 = 4 * 4.
    Therefore, [4,16,2] is a square streak.
    It can be shown that every subsequence of length 4 is not a square streak.
    Example 2:
    Input: nums = [2,3,5,6,7]
    Output: -1
    Explanation: There is no square streak in nums so return -1.
      Constraints:
    2 <= nums.length <= 105
    2 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 6, 16, 8, 2};
        int expected = 3;
        var result = solution.longestSquareStreak(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 5, 6, 7};
        int expected = -1;
        var result = solution.longestSquareStreak(nums);
        assertThat(result).isEqualTo(expected);
    }

}
