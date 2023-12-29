package com.blogspot.ostas.leetcode.all.hard.number_of_squareful_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,17,8]
    Output: 2
    Explanation: [1,8,17] and [17,8,1] are the valid permutations.
    Example 2:
    Input: nums = [2,2,2]
    Output: 1
      Constraints:
    1 <= nums.length <= 12
    0 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 17, 8};
        int expected = 2;
        var result = solution.numSquarefulPerms(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 2};
        int expected = 1;
        var result = solution.numSquarefulPerms(nums);
        assertThat(result).isEqualTo(expected);
    }

}
