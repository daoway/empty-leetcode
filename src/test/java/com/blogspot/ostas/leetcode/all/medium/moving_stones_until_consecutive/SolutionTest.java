package com.blogspot.ostas.leetcode.all.medium.moving_stones_until_consecutive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 1, b = 2, c = 5
    Output: [1,2]
    Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
    Example 2:
    Input: a = 4, b = 3, c = 2
    Output: [0,0]
    Explanation: We cannot make any moves.
    Example 3:
    Input: a = 3, b = 5, c = 1
    Output: [1,2]
    Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
      Constraints:
    1 <= a, b, c <= 100
    a, b, and c have different values.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 1;
        int b = 2;
        int c = 5;
        int[] expected = new int[]{1, 2};
        var result = solution.numMovesStones(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 4;
        int b = 3;
        int c = 2;
        int[] expected = new int[]{0, 0};
        var result = solution.numMovesStones(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int a = 3;
        int b = 5;
        int c = 1;
        int[] expected = new int[]{1, 2};
        var result = solution.numMovesStones(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

}
