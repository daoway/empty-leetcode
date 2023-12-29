package com.blogspot.ostas.leetcode.all.medium.non_decreasing_subsequences;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,6,7,7]
    Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
    Example 2:
    Input: nums = [4,4,3,2,1]
    Output: [[4,4]]
      Constraints:
    1 <= nums.length <= 15
    -100 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 6, 7, 7};
        List<List<Integer>> expected =
                List.of(List.of(4, 6), List.of(4, 6, 7), List.of(4, 6, 7, 7), List.of(4, 7),
                        List.of(4, 7, 7), List.of(6, 7), List.of(6, 7, 7), List.of(7, 7));
        var result = solution.findSubsequences(nums);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 4, 3, 2, 1};
        List<List<Integer>> expected = List.of(List.of(4, 4));
        var result = solution.findSubsequences(nums);
        assertThat(result).isEqualTo(expected);
    }

}
