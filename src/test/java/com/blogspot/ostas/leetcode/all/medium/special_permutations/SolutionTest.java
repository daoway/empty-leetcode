package com.blogspot.ostas.leetcode.all.medium.special_permutations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,6]
    Output: 2
    Explanation: [3,6,2] and [2,6,3] are the two special permutations of nums.
    Example 2:
    Input: nums = [1,4,3]
    Output: 2
    Explanation: [3,1,4] and [4,1,3] are the two special permutations of nums.
      Constraints:
    2 <= nums.length <= 14
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 6};
        int expected = 2;
        var result = solution.specialPerm(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 3};
        int expected = 2;
        var result = solution.specialPerm(nums);
        assertThat(result).isEqualTo(expected);
    }

}
