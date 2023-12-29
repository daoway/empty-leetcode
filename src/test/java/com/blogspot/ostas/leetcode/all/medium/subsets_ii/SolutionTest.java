package com.blogspot.ostas.leetcode.all.medium.subsets_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,2]
    Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
    Example 2:
    Input: nums = [0]
    Output: [[],[0]]
      Constraints:
    1 <= nums.length <= 10
    -10 <= nums[i] <= 10
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2};
        List<List<Integer>> expected =
                List.of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 2), List.of(2),
                        List.of(2, 2));
        var result = solution.subsetsWithDup(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0};
        List<List<Integer>> expected = List.of(List.of(), List.of(0));
        var result = solution.subsetsWithDup(nums);
        assertThat(result).isEqualTo(expected);
    }

}
