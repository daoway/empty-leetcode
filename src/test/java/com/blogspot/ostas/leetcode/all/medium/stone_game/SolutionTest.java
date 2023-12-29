package com.blogspot.ostas.leetcode.all.medium.stone_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: piles = [5,3,4,5]
    Output: true
    Explanation:
    Alice starts first, and can only take the first 5 or the last 5.
    Say she takes the first 5, so that the row becomes [3, 4, 5].
    If Bob takes 3, then the board is [4, 5], and Alice takes 5 to win with 10 points.
    If Bob takes the last 5, then the board is [3, 4], and Alice takes 4 to win with 9 points.
    This demonstrated that taking the first 5 was a winning move for Alice, so we return true.
    Example 2:
    Input: piles = [3,7,2,3]
    Output: true
      Constraints:
    2 <= piles.length <= 500
    piles.length is even.
    1 <= piles[i] <= 500
    sum(piles[i]) is odd.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] piles = new int[]{5, 3, 4, 5};
        boolean expected = true;
        var result = solution.stoneGame(piles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] piles = new int[]{3, 7, 2, 3};
        boolean expected = true;
        var result = solution.stoneGame(piles);
        assertThat(result).isEqualTo(expected);
    }

}
