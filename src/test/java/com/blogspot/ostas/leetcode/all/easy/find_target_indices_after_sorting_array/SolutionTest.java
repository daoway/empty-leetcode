package com.blogspot.ostas.leetcode.all.easy.find_target_indices_after_sorting_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,5,2,3], target = 2
    Output: [1,2]
    Explanation: After sorting, nums is [1,2,2,3,5].
    The indices where nums[i] == 2 are 1 and 2.
    Example 2:
    Input: nums = [1,2,5,2,3], target = 3
    Output: [3]
    Explanation: After sorting, nums is [1,2,2,3,5].
    The index where nums[i] == 3 is 3.
    Example 3:
    Input: nums = [1,2,5,2,3], target = 5
    Output: [4]
    Explanation: After sorting, nums is [1,2,2,3,5].
    The index where nums[i] == 5 is 4.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i], target <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 5, 2, 3};
        int target = 2;
        List<Integer> expected = List.of(1, 2);
        var result = solution.targetIndices(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 5, 2, 3};
        int target = 3;
        List<Integer> expected = List.of(3);
        var result = solution.targetIndices(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 5, 2, 3};
        int target = 5;
        List<Integer> expected = List.of(4);
        var result = solution.targetIndices(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
