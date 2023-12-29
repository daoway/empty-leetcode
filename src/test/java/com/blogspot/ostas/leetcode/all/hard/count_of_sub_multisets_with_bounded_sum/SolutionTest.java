package com.blogspot.ostas.leetcode.all.hard.count_of_sub_multisets_with_bounded_sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,2,3], l = 6, r = 6
    Output: 1
    Explanation: The only subset of nums that has a sum of 6 is {1, 2, 3}.
    Example 2:
    Input: nums = [2,1,4,2,7], l = 1, r = 5
    Output: 7
    Explanation: The subsets of nums that have a sum within the range [1, 5] are {1}, {2}, {4}, {2, 2}, {1, 2}, {1, 4}, and {1, 2, 2}.
    Example 3:
    Input: nums = [1,2,1,3,5,2], l = 3, r = 5
    Output: 9
    Explanation: The subsets of nums that have a sum within the range [3, 5] are {3}, {5}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {1, 1, 2}, {1, 1, 3}, and {1, 2, 2}.
      Constraints:
    1 <= nums.length <= 2 * 104
    0 <= nums[i] <= 2 * 104
    Sum of nums does not exceed 2 * 104.
    0 <= l <= r <= 2 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 2, 2, 3);
        int l = 6;
        int r = 6;
        int expected = 1;
        var result = solution.countSubMultisets(nums, l, r);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(2, 1, 4, 2, 7);
        int l = 1;
        int r = 5;
        int expected = 7;
        var result = solution.countSubMultisets(nums, l, r);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 2, 1, 3, 5, 2);
        int l = 3;
        int r = 5;
        int expected = 9;
        var result = solution.countSubMultisets(nums, l, r);
        assertThat(result).isEqualTo(expected);
    }

}
