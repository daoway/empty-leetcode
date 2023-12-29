package com.blogspot.ostas.leetcode.all.hard.count_number_of_special_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1,2,2]
    Output: 3
    Explanation: The special subsequences are bolded [0,1,2,2], [0,1,2,2], and [0,1,2,2].
    Example 2:
    Input: nums = [2,2,0,0]
    Output: 0
    Explanation: There are no special subsequences in [2,2,0,0].
    Example 3:
    Input: nums = [0,1,2,0,1,2]
    Output: 7
    Explanation: The special subsequences are bolded:
    - [0,1,2,0,1,2]
    - [0,1,2,0,1,2]
    - [0,1,2,0,1,2]
    - [0,1,2,0,1,2]
    - [0,1,2,0,1,2]
    - [0,1,2,0,1,2]
    - [0,1,2,0,1,2]
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 2};
        int expected = 3;
        var result = solution.countSpecialSubsequences(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 0, 0};
        int expected = 0;
        var result = solution.countSpecialSubsequences(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 0, 1, 2};
        int expected = 7;
        var result = solution.countSpecialSubsequences(nums);
        assertThat(result).isEqualTo(expected);
    }

}
