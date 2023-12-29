package com.blogspot.ostas.leetcode.all.easy.determine_the_winner_of_a_bowling_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: player1 = [4,10,7,9], player2 = [6,5,2,3]
    Output: 1
    Explanation: The score of player1 is 4 + 10 + 2*7 + 2*9 = 46.
    The score of player2 is 6 + 5 + 2 + 3 = 16.
    Score of player1 is more than the score of player2, so, player1 is the winner, and the answer is 1.
    Example 2:
    Input: player1 = [3,5,7,6], player2 = [8,10,10,2]
    Output: 2
    Explanation: The score of player1 is 3 + 5 + 7 + 6 = 21.
    The score of player2 is 8 + 10 + 2*10 + 2*2 = 42.
    Score of player2 is more than the score of player1, so, player2 is the winner, and the answer is 2.
    Example 3:
    Input: player1 = [2,3], player2 = [4,1]
    Output: 0
    Explanation: The score of player1 is 2 + 3 = 5
    The score of player2 is 4 + 1 = 5
    The score of player1 equals to the score of player2, so, there is a draw, and the answer is 0.
      Constraints:
    n == player1.length == player2.length
    1 <= n <= 1000
    0 <= player1[i], player2[i] <= 10
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] player1 = new int[]{4, 10, 7, 9};
        int[] player2 = new int[]{6, 5, 2, 3};
        int expected = 1;
        var result = solution.isWinner(player1, player2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] player1 = new int[]{3, 5, 7, 6};
        int[] player2 = new int[]{8, 10, 10, 2};
        int expected = 2;
        var result = solution.isWinner(player1, player2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] player1 = new int[]{2, 3};
        int[] player2 = new int[]{4, 1};
        int expected = 0;
        var result = solution.isWinner(player1, player2);
        assertThat(result).isEqualTo(expected);
    }

}
