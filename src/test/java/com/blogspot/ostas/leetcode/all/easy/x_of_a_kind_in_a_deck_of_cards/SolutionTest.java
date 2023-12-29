package com.blogspot.ostas.leetcode.all.easy.x_of_a_kind_in_a_deck_of_cards;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: deck = [1,2,3,4,4,3,2,1]
    Output: true
    Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
    Example 2:
    Input: deck = [1,1,1,2,2,2,3,3]
    Output: false
    Explanation: No possible partition.
      Constraints:
    1 <= deck.length <= 104
    0 <= deck[i] < 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] deck = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        boolean expected = true;
        var result = solution.hasGroupsSizeX(deck);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] deck = new int[]{1, 1, 1, 2, 2, 2, 3, 3};
        boolean expected = false;
        var result = solution.hasGroupsSizeX(deck);
        assertThat(result).isEqualTo(expected);
    }

}
