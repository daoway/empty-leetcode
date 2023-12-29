package com.blogspot.ostas.leetcode.all.hard.number_of_different_subsequences_gcds;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [6,10,3]
    Output: 5
    Explanation: The figure shows all the non-empty subsequences and their GCDs.
    The different GCDs are 6, 10, 3, 2, and 1.
    Example 2:
    Input: nums = [5,15,40,5,6]
    Output: 7
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 2 * 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{6, 10, 3};
        int expected = 5;
        var result = solution.countDifferentSubsequenceGCDs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 15, 40, 5, 6};
        int expected = 7;
        var result = solution.countDifferentSubsequenceGCDs(nums);
        assertThat(result).isEqualTo(expected);
    }

}
