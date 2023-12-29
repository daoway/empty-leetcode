package com.blogspot.ostas.leetcode.all.medium.permutations.v1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    Example 2:
    Input: nums = [0,1]
    Output: [[0,1],[1,0]]
    Example 3:
    Input: nums = [1]
    Output: [[1]]
      Constraints:
    1 <= nums.length <= 6
    -10 <= nums[i] <= 10
    All the integers of nums are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected =
                List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1),
                        List.of(3, 1, 2), List.of(3, 2, 1));
        var result = solution.permute(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0));
        var result = solution.permute(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        List<List<Integer>> expected = List.of(List.of(1));
        var result = solution.permute(nums);
        assertThat(result).isEqualTo(expected);
    }

}
