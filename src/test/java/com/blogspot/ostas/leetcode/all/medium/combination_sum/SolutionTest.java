package com.blogspot.ostas.leetcode.all.medium.combination_sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: candidates = [2,3,6,7], target = 7
    Output: [[2,2,3],[7]]
    Explanation:
    2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    7 is a candidate, and 7 = 7.
    These are the only two combinations.
    Example 2:
    Input: candidates = [2,3,5], target = 8
    Output: [[2,2,2,2],[2,3,3],[3,5]]
    Example 3:
    Input: candidates = [2], target = 1
    Output: []
      Constraints:
    1 <= candidates.length <= 30
    2 <= candidates[i] <= 40
    All elements of candidates are distinct.
    1 <= target <= 40
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = List.of(List.of(2, 2, 3), List.of(7));
        var result = solution.combinationSum(candidates, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] candidates = new int[]{2, 3, 5};
        int target = 8;
        List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
        var result = solution.combinationSum(candidates, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] candidates = new int[]{2};
        int target = 1;
        List<List<Integer>> expected = List.of();
        var result = solution.combinationSum(candidates, target);
        assertThat(result).isEqualTo(expected);
    }

}
