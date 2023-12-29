package com.blogspot.ostas.leetcode.all.medium.best_team_with_no_conflicts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: scores = [1,3,5,10,15], ages = [1,2,3,4,5]
    Output: 34
    Explanation: You can choose all the players.
    Example 2:
    Input: scores = [4,5,6,5], ages = [2,1,2,1]
    Output: 16
    Explanation: It is best to choose the last 3 players. Notice that you are allowed to choose multiple people of the same age.
    Example 3:
    Input: scores = [1,2,3,5], ages = [8,9,10,1]
    Output: 6
    Explanation: It is best to choose the first 3 players.
      Constraints:
    1 <= scores.length, ages.length <= 1000
    scores.length == ages.length
    1 <= scores[i] <= 106
    1 <= ages[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] scores = new int[]{1, 3, 5, 10, 15};
        int[] ages = new int[]{1, 2, 3, 4, 5};
        int expected = 34;
        var result = solution.bestTeamScore(scores, ages);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] scores = new int[]{4, 5, 6, 5};
        int[] ages = new int[]{2, 1, 2, 1};
        int expected = 16;
        var result = solution.bestTeamScore(scores, ages);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] scores = new int[]{1, 2, 3, 5};
        int[] ages = new int[]{8, 9, 10, 1};
        int expected = 6;
        var result = solution.bestTeamScore(scores, ages);
        assertThat(result).isEqualTo(expected);
    }

}
