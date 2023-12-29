package com.blogspot.ostas.leetcode.all.medium.largest_combination_with_bitwise_and_greater_than_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: candidates = [16,17,71,62,12,24,14]
    Output: 4
    Explanation: The combination [16,17,62,24] has a bitwise AND of 16 & 17 & 62 & 24 = 16 > 0.
    The size of the combination is 4.
    It can be shown that no combination with a size greater than 4 has a bitwise AND greater than 0.
    Note that more than one combination may have the largest size.
    For example, the combination [62,12,24,14] has a bitwise AND of 62 & 12 & 24 & 14 = 8 > 0.
    Example 2:
    Input: candidates = [8,8]
    Output: 2
    Explanation: The largest combination [8,8] has a bitwise AND of 8 & 8 = 8 > 0.
    The size of the combination is 2, so we return 2.
      Constraints:
    1 <= candidates.length <= 105
    1 <= candidates[i] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] candidates = new int[]{16, 17, 71, 62, 12, 24, 14};
        int expected = 4;
        var result = solution.largestCombination(candidates);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] candidates = new int[]{8, 8};
        int expected = 2;
        var result = solution.largestCombination(candidates);
        assertThat(result).isEqualTo(expected);
    }

}
