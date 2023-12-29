package com.blogspot.ostas.leetcode.all.medium.longest_arithmetic_subsequence_of_given_difference;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,4], difference = 1
    Output: 4
    Explanation: The longest arithmetic subsequence is [1,2,3,4].
    Example 2:
    Input: arr = [1,3,5,7], difference = 1
    Output: 1
    Explanation: The longest arithmetic subsequence is any single element.
    Example 3:
    Input: arr = [1,5,7,8,5,3,4,2,1], difference = -2
    Output: 4
    Explanation: The longest arithmetic subsequence is [7,5,3,1].
      Constraints:
    1 <= arr.length <= 105
    -104 <= arr[i], difference <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4};
        int difference = 1;
        int expected = 4;
        var result = solution.longestSubsequence(arr, difference);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 3, 5, 7};
        int difference = 1;
        int expected = 1;
        var result = solution.longestSubsequence(arr, difference);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1};
        int difference = -2;
        int expected = 4;
        var result = solution.longestSubsequence(arr, difference);
        assertThat(result).isEqualTo(expected);
    }

}
