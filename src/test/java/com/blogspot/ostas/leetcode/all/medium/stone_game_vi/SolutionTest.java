package com.blogspot.ostas.leetcode.all.medium.stone_game_vi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: aliceValues = [1,3], bobValues = [2,1]
    Output: 1
    Explanation:
    If Alice takes stone 1 (0-indexed) first, Alice will receive 3 points.
    Bob can only choose stone 0, and will only receive 2 points.
    Alice wins.
    Example 2:
    Input: aliceValues = [1,2], bobValues = [3,1]
    Output: 0
    Explanation:
    If Alice takes stone 0, and Bob takes stone 1, they will both have 1 point.
    Draw.
    Example 3:
    Input: aliceValues = [2,4,3], bobValues = [1,6,7]
    Output: -1
    Explanation:
    Regardless of how Alice plays, Bob will be able to have more points than Alice.
    For example, if Alice takes stone 1, Bob can take stone 2, and Alice takes stone 0, Alice will have 6 points to Bob's 7.
    Bob wins.
      Constraints:
    n == aliceValues.length == bobValues.length
    1 <= n <= 105
    1 <= aliceValues[i], bobValues[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] aliceValues = new int[]{1, 3};
        int[] bobValues = new int[]{2, 1};
        int expected = 1;
        var result = solution.stoneGameVI(aliceValues, bobValues);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] aliceValues = new int[]{1, 2};
        int[] bobValues = new int[]{3, 1};
        int expected = 0;
        var result = solution.stoneGameVI(aliceValues, bobValues);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] aliceValues = new int[]{2, 4, 3};
        int[] bobValues = new int[]{1, 6, 7};
        int expected = -1;
        var result = solution.stoneGameVI(aliceValues, bobValues);
        assertThat(result).isEqualTo(expected);
    }

}
