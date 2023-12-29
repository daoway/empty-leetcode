package com.blogspot.ostas.leetcode.all.hard.dice_roll_simulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, rollMax = [1,1,2,2,2,3]
    Output: 34
    Explanation: There will be 2 rolls of die, if there are no constraints on the die, there are 6 * 6 = 36 possible combinations. In this case, looking at rollMax array, the numbers 1 and 2 appear at most once consecutively, therefore sequences (1,1) and (2,2) cannot occur, so the final answer is 36-2 = 34.
    Example 2:
    Input: n = 2, rollMax = [1,1,1,1,1,1]
    Output: 30
    Example 3:
    Input: n = 3, rollMax = [1,1,1,2,2,3]
    Output: 181
      Constraints:
    1 <= n <= 5000
    rollMax.length == 6
    1 <= rollMax[i] <= 15
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[] rollMax = new int[]{1, 1, 2, 2, 2, 3};
        int expected = 34;
        var result = solution.dieSimulator(n, rollMax);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[] rollMax = new int[]{1, 1, 1, 1, 1, 1};
        int expected = 30;
        var result = solution.dieSimulator(n, rollMax);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int[] rollMax = new int[]{1, 1, 1, 2, 2, 3};
        int expected = 181;
        var result = solution.dieSimulator(n, rollMax);
        assertThat(result).isEqualTo(expected);
    }

}
