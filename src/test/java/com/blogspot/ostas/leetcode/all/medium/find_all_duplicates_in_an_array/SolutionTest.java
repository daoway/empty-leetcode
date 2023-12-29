package com.blogspot.ostas.leetcode.all.medium.find_all_duplicates_in_an_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [2,3]
    Example 2:
    Input: nums = [1,1,2]
    Output: [1]
    Example 3:
    Input: nums = [1]
    Output: []
      Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i] <= n
    Each element in nums appears once or twice.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = List.of(2, 3);
        var result = solution.findDuplicates(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2};
        List<Integer> expected = List.of(1);
        var result = solution.findDuplicates(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        List<Integer> expected = List.of();
        var result = solution.findDuplicates(nums);
        assertThat(result).isEqualTo(expected);
    }

}
