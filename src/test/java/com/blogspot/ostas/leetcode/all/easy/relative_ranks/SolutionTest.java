package com.blogspot.ostas.leetcode.all.easy.relative_ranks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: score = [5,4,3,2,1]
    Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
    Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
    Example 2:
    Input: score = [10,3,8,9,4]
    Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
    Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
      Constraints:
    n == score.length
    1 <= n <= 104
    0 <= score[i] <= 106
    All the values in score are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] score = new int[]{5, 4, 3, 2, 1};
        String[] expected = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        var result = solution.findRelativeRanks(score);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] score = new int[]{10, 3, 8, 9, 4};
        String[] expected = new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        var result = solution.findRelativeRanks(score);
        assertThat(result).isEqualTo(expected);
    }

}
