package com.blogspot.ostas.leetcode.all.hard.the_earliest_and_latest_rounds_where_players_compete;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 11, firstPlayer = 2, secondPlayer = 4
    Output: [3,4]
    Explanation:
    One possible scenario which leads to the earliest round number:
    First round: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
    Second round: 2, 3, 4, 5, 6, 11
    Third round: 2, 3, 4
    One possible scenario which leads to the latest round number:
    First round: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
    Second round: 1, 2, 3, 4, 5, 6
    Third round: 1, 2, 4
    Fourth round: 2, 4
    Example 2:
    Input: n = 5, firstPlayer = 1, secondPlayer = 5
    Output: [1,1]
    Explanation: The players numbered 1 and 5 compete in the first round.
    There is no way to make them compete in any other round.
      Constraints:
    2 <= n <= 28
    1 <= firstPlayer < secondPlayer <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 11;
        int firstPlayer = 2;
        int secondPlayer = 4;
        int[] expected = new int[]{3, 4};
        var result = solution.earliestAndLatest(n, firstPlayer, secondPlayer);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int firstPlayer = 1;
        int secondPlayer = 5;
        int[] expected = new int[]{1, 1};
        var result = solution.earliestAndLatest(n, firstPlayer, secondPlayer);
        assertThat(result).isEqualTo(expected);
    }

}
