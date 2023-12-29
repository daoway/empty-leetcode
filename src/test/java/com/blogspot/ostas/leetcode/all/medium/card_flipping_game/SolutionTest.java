package com.blogspot.ostas.leetcode.all.medium.card_flipping_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: fronts = [1,2,4,4,7], backs = [1,3,4,1,3]
    Output: 2
    Explanation:
    If we flip the second card, the face up numbers are [1,3,4,4,7] and the face down are [1,2,4,1,3].
    2 is the minimum good integer as it appears facing down but not facing up.
    It can be shown that 2 is the minimum possible good integer obtainable after flipping some cards.
    Example 2:
    Input: fronts = [1], backs = [1]
    Output: 0
    Explanation:
    There are no good integers no matter how we flip the cards, so we return 0.
      Constraints:
    n == fronts.length == backs.length
    1 <= n <= 1000
    1 <= fronts[i], backs[i] <= 2000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] fronts = new int[]{1, 2, 4, 4, 7};
        int[] backs = new int[]{1, 3, 4, 1, 3};
        int expected = 2;
        var result = solution.flipgame(fronts, backs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] fronts = new int[]{1};
        int[] backs = new int[]{1};
        int expected = 0;
        var result = solution.flipgame(fronts, backs);
        assertThat(result).isEqualTo(expected);
    }

}
