package com.blogspot.ostas.leetcode.all.hard.sum_of_floored_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,5,9]
    Output: 10
    Explanation:
    floor(2 / 5) = floor(2 / 9) = floor(5 / 9) = 0
    floor(2 / 2) = floor(5 / 5) = floor(9 / 9) = 1
    floor(5 / 2) = 2
    floor(9 / 2) = 4
    floor(9 / 5) = 1
    We calculate the floor of the division for every pair of indices in the array then sum them up.
    Example 2:
    Input: nums = [7,7,7,7,7,7,7]
    Output: 49
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 5, 9};
        int expected = 10;
        var result = solution.sumOfFlooredPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        int expected = 49;
        var result = solution.sumOfFlooredPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

}
