package com.blogspot.ostas.leetcode.all.medium.largest_divisible_subset;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3]
    Output: [1,2]
    Explanation: [1,3] is also accepted.
    Example 2:
    Input: nums = [1,2,4,8]
    Output: [1,2,4,8]
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 2 * 109
    All the integers in nums are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        List<Integer> expected1 = List.of(1, 2);
        List<Integer> expected3 = List.of(2, 1);
        List<Integer> expected2 = List.of(1, 3);
        var result = solution.largestDivisibleSubset(nums);
        assertThat(result).isIn(expected1,expected2,expected3);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 4, 8};
        List<Integer> expected1 = List.of(1, 2, 4, 8);
        List<Integer> expected2 = List.of(8, 4, 2, 1);
        var result = solution.largestDivisibleSubset(nums);
        assertThat(result).isIn(expected1,expected2);
    }

}
