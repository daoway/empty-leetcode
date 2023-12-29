package com.blogspot.ostas.leetcode.all.medium.find_the_winner_of_the_circular_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, k = 2
    Output: 3
    Explanation: Here are the steps of the game:
    1) Start at friend 1.
    2) Count 2 friends clockwise, which are friends 1 and 2.
    3) Friend 2 leaves the circle. Next start is friend 3.
    4) Count 2 friends clockwise, which are friends 3 and 4.
    5) Friend 4 leaves the circle. Next start is friend 5.
    6) Count 2 friends clockwise, which are friends 5 and 1.
    7) Friend 1 leaves the circle. Next start is friend 3.
    8) Count 2 friends clockwise, which are friends 3 and 5.
    9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.
    Example 2:
    Input: n = 6, k = 5
    Output: 1
    Explanation: The friends leave in this order: 5, 4, 6, 2, 3. The winner is friend 1.
      Constraints:
    1 <= k <= n <= 500
      Follow up:
    Could you solve this problem in linear time with constant space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int k = 2;
        int expected = 3;
        var result = solution.findTheWinner(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int k = 5;
        int expected = 1;
        var result = solution.findTheWinner(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
