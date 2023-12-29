package com.blogspot.ostas.leetcode.all.medium.minimum_consecutive_cards_to_pick_up;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cards = [3,4,2,3,4,7]
    Output: 4
    Explanation: We can pick up the cards [3,4,2,3] which contain a matching pair of cards with value 3. Note that picking up the cards [4,2,3,4] is also optimal.
    Example 2:
    Input: cards = [1,0,5,3]
    Output: -1
    Explanation: There is no way to pick up a set of consecutive cards that contain a pair of matching cards.
      Constraints:
    1 <= cards.length <= 105
    0 <= cards[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cards = new int[]{3, 4, 2, 3, 4, 7};
        int expected = 4;
        var result = solution.minimumCardPickup(cards);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cards = new int[]{1, 0, 5, 3};
        int expected = -1;
        var result = solution.minimumCardPickup(cards);
        assertThat(result).isEqualTo(expected);
    }

}
