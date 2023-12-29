package com.blogspot.ostas.leetcode.all.medium.minimum_array_length_after_pair_removals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,4,9]
    Output: 0
    Explanation: Initially, nums = [1, 3, 4, 9].
    In the first operation, we can choose index 0 and 1 because nums[0] < nums[1] <=> 1 < 3.
    Remove indices 0 and 1, and nums becomes [4, 9].
    For the next operation, we can choose index 0 and 1 because nums[0] < nums[1] <=> 4 < 9.
    Remove indices 0 and 1, and nums becomes an empty array [].
    Hence, the minimum length achievable is 0.
    Example 2:
    Input: nums = [2,3,6,9]
    Output: 0
    Explanation: Initially, nums = [2, 3, 6, 9].
    In the first operation, we can choose index 0 and 2 because nums[0] < nums[2] <=> 2 < 6.
    Remove indices 0 and 2, and nums becomes [3, 9].
    For the next operation, we can choose index 0 and 1 because nums[0] < nums[1] <=> 3 < 9.
    Remove indices 0 and 1, and nums becomes an empty array [].
    Hence, the minimum length achievable is 0.
    Example 3:
    Input: nums = [1,1,2]
    Output: 1
    Explanation: Initially, nums = [1, 1, 2].
    In an operation, we can choose index 0 and 2 because nums[0] < nums[2] <=> 1 < 2.
    Remove indices 0 and 2, and nums becomes [1].
    It is no longer possible to perform an operation on the array.
    Hence, the minimum achievable length is 1.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    nums is sorted in non-decreasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 3, 4, 9);
        int expected = 0;
        var result = solution.minLengthAfterRemovals(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(2, 3, 6, 9);
        int expected = 0;
        var result = solution.minLengthAfterRemovals(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 1, 2);
        int expected = 1;
        var result = solution.minLengthAfterRemovals(nums);
        assertThat(result).isEqualTo(expected);
    }

}
