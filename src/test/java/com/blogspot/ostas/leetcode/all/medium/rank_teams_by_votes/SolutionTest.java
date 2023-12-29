package com.blogspot.ostas.leetcode.all.medium.rank_teams_by_votes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: votes = ["ABC","ACB","ABC","ACB","ACB"]
    Output: "ACB"
    Explanation:
    Team A was ranked first place by 5 voters. No other team was voted as first place, so team A is the first team.
    Team B was ranked second by 2 voters and ranked third by 3 voters.
    Team C was ranked second by 3 voters and ranked third by 2 voters.
    As most of the voters ranked C second, team C is the second team, and team B is the third.
    Example 2:
    Input: votes = ["WXYZ","XYZW"]
    Output: "XWYZ"
    Explanation:
    X is the winner due to the tie-breaking rule. X has the same votes as W for the first position, but X has one vote in the second position, while W does not have any votes in the second position.
    Example 3:
    Input: votes = ["ZMNAGUEDSJYLBOPHRQICWFXTVK"]
    Output: "ZMNAGUEDSJYLBOPHRQICWFXTVK"
    Explanation: Only one voter, so their votes are used for the ranking.
      Constraints:
    1 <= votes.length <= 1000
    1 <= votes[i].length <= 26
    votes[i].length == votes[j].length for 0 <= i, j < votes.length.
    votes[i][j] is an English uppercase letter.
    All characters of votes[i] are unique.
    All the characters that occur in votes[0] also occur in votes[j] where 1 <= j < votes.length.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] votes = new String[]{"ABC", "ACB", "ABC", "ACB", "ACB"};
        String expected = "ACB";
        var result = solution.rankTeams(votes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] votes = new String[]{"WXYZ", "XYZW"};
        String expected = "XWYZ";
        var result = solution.rankTeams(votes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] votes = new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"};
        String expected = "ZMNAGUEDSJYLBOPHRQICWFXTVK";
        var result = solution.rankTeams(votes);
        assertThat(result).isEqualTo(expected);
    }

}
