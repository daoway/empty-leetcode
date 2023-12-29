package com.blogspot.ostas.leetcode.all.hard.two_four_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cards = [4,1,8,7]
    Output: true
    Explanation: (8-4) * (7-1) = 24
    Example 2:
    Input: cards = [1,2,1,2]
    Output: false
      Constraints:
    cards.length == 4
    1 <= cards[i] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cards = new int[]{4, 1, 8, 7};
        boolean expected = true;
        var result = solution.judgePoint24(cards);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cards = new int[]{1, 2, 1, 2};
        boolean expected = false;
        var result = solution.judgePoint24(cards);
        assertThat(result).isEqualTo(expected);
    }

}
