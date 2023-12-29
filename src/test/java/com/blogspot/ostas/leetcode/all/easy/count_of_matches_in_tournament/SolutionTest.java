package com.blogspot.ostas.leetcode.all.easy.count_of_matches_in_tournament;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7
    Output: 6
    Explanation: Details of the tournament:
    - 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
    - 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
    - 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
    Total number of matches = 3 + 2 + 1 = 6.
    Example 2:
    Input: n = 14
    Output: 13
    Explanation: Details of the tournament:
    - 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
    - 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
    - 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
    - 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
    Total number of matches = 7 + 3 + 2 + 1 = 13.
      Constraints:
    1 <= n <= 200
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int expected = 6;
        var result = solution.numberOfMatches(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 14;
        int expected = 13;
        var result = solution.numberOfMatches(n);
        assertThat(result).isEqualTo(expected);
    }

}
