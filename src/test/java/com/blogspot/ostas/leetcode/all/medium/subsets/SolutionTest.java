package com.blogspot.ostas.leetcode.all.medium.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3]
    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    Example 2:
    Input: nums = [0]
    Output: [[],[0]]
      Constraints:
    1 <= nums.length <= 10
    -10 <= nums[i] <= 10
    All the numbers of nums are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected =
                List.of(List.of(), List.of(1), List.of(2), List.of(1, 2), List.of(3),
                        List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
        var result = solution.subsets(nums);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0};
        List<List<Integer>> expected = List.of(List.of(), List.of(0));
        var result = solution.subsets(nums);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
