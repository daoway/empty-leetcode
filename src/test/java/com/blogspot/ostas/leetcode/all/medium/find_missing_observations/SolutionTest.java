package com.blogspot.ostas.leetcode.all.medium.find_missing_observations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rolls = [3,2,4,3], mean = 4, n = 2
    Output: [6,6]
    Explanation: The mean of all n + m rolls is (3 + 2 + 4 + 3 + 6 + 6) / 6 = 4.
    Example 2:
    Input: rolls = [1,5,6], mean = 3, n = 4
    Output: [2,3,2,2]
    Explanation: The mean of all n + m rolls is (1 + 5 + 6 + 2 + 3 + 2 + 2) / 7 = 3.
    Example 3:
    Input: rolls = [1,2,3,4], mean = 6, n = 4
    Output: []
    Explanation: It is impossible for the mean to be 6 no matter what the 4 missing rolls are.
      Constraints:
    m == rolls.length
    1 <= n, m <= 105
    1 <= rolls[i], mean <= 6
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rolls = new int[]{3, 2, 4, 3};
        int mean = 4;
        int n = 2;
        int[] expected = new int[]{6, 6};
        var result = solution.missingRolls(rolls, mean, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rolls = new int[]{1, 5, 6};
        int mean = 3;
        int n = 4;
        int[] expected = new int[]{2, 3, 2, 2};
        var result = solution.missingRolls(rolls, mean, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] rolls = new int[]{1, 2, 3, 4};
        int mean = 6;
        int n = 4;
        int[] expected = new int[]{};
        var result = solution.missingRolls(rolls, mean, n);
        assertThat(result).isEqualTo(expected);
    }

}
