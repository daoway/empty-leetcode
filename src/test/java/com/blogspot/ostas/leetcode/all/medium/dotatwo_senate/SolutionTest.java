package com.blogspot.ostas.leetcode.all.medium.dotatwo_senate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: senate = "RD"
    Output: "Radiant"
    Explanation:
    The first senator comes from Radiant and he can just ban the next senator's right in round 1.
    And the second senator can't exercise any rights anymore since his right has been banned.
    And in round 2, the first senator can just announce the victory since he is the only guy in the senate who can vote.
    Example 2:
    Input: senate = "RDD"
    Output: "Dire"
    Explanation:
    The first senator comes from Radiant and he can just ban the next senator's right in round 1.
    And the second senator can't exercise any rights anymore since his right has been banned.
    And the third senator comes from Dire and he can ban the first senator's right in round 1.
    And in round 2, the third senator can just announce the victory since he is the only guy in the senate who can vote.
      Constraints:
    n == senate.length
    1 <= n <= 104
    senate[i] is either 'R' or 'D'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String senate = "RD";
        String expected = "Radiant";
        var result = solution.predictPartyVictory(senate);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String senate = "RDD";
        String expected = "Dire";
        var result = solution.predictPartyVictory(senate);
        assertThat(result).isEqualTo(expected);
    }

}
