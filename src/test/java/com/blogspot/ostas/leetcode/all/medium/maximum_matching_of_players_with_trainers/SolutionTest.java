package com.blogspot.ostas.leetcode.all.medium.maximum_matching_of_players_with_trainers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: players = [4,7,9], trainers = [8,2,5,8]
    Output: 2
    Explanation:
    One of the ways we can form two matchings is as follows:
    - players[0] can be matched with trainers[0] since 4 <= 8.
    - players[1] can be matched with trainers[3] since 7 <= 8.
    It can be proven that 2 is the maximum number of matchings that can be formed.
    Example 2:
    Input: players = [1,1,1], trainers = [10]
    Output: 1
    Explanation:
    The trainer can be matched with any of the 3 players.
    Each player can only be matched with one trainer, so the maximum answer is 1.
      Constraints:
    1 <= players.length, trainers.length <= 105
    1 <= players[i], trainers[j] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] players = new int[]{4, 7, 9};
        int[] trainers = new int[]{8, 2, 5, 8};
        int expected = 2;
        var result = solution.matchPlayersAndTrainers(players, trainers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] players = new int[]{1, 1, 1};
        int[] trainers = new int[]{10};
        int expected = 1;
        var result = solution.matchPlayersAndTrainers(players, trainers);
        assertThat(result).isEqualTo(expected);
    }

}
