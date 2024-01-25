package com.blogspot.ostas.leetcode.all.hard.stone_game_v;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stoneValue = [6,2,3,4,5,5]
    Output: 18
    Explanation: In the first round, Alice divides the row to [6,2,3], [4,5,5]. The left row has the value 11 and the right row has value 14. Bob throws away the right row and Alice's score is now 11.
    In the second round Alice divides the row to [6], [2,3]. This time Bob throws away the left row and Alice's score becomes 16 (11 + 5).
    The last round Alice has only one choice to divide the row which is [2], [3]. Bob throws away the right row and Alice's score is now 18 (16 + 2). The game ends because only one stone is remaining in the row.
    Example 2:
    Input: stoneValue = [7,7,7,7,7,7,7]
    Output: 28
    Example 3:
    Input: stoneValue = [4]
    Output: 0
      Constraints:
    1 <= stoneValue.length <= 500
    1 <= stoneValue[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stoneValue = new int[]{6, 2, 3, 4, 5, 5};
        int expected = 18;
        var result = solution.stoneGameV(stoneValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stoneValue = new int[]{7, 7, 7, 7, 7, 7, 7};
        int expected = 28;
        var result = solution.stoneGameV(stoneValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] stoneValue = new int[]{4};
        int expected = 0;
        var result = solution.stoneGameV(stoneValue);
        assertThat(result).isEqualTo(expected);
    }

}
