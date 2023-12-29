package com.blogspot.ostas.leetcode.all.medium.divide_players_into_teams_of_equal_skill;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: skill = [3,2,5,1,3,4]
    Output: 22
    Explanation:
    Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6.
    The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.
    Example 2:
    Input: skill = [3,4]
    Output: 12
    Explanation:
    The two players form a team with a total skill of 7.
    The chemistry of the team is 3 * 4 = 12.
    Example 3:
    Input: skill = [1,1,2,3]
    Output: -1
    Explanation:
    There is no way to divide the players into teams such that the total skill of each team is equal.
      Constraints:
    2 <= skill.length <= 105
    skill.length is even.
    1 <= skill[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] skill = new int[]{3, 2, 5, 1, 3, 4};
        long expected = 22;
        var result = solution.dividePlayers(skill);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] skill = new int[]{3, 4};
        long expected = 12;
        var result = solution.dividePlayers(skill);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] skill = new int[]{1, 1, 2, 3};
        long expected = -1;
        var result = solution.dividePlayers(skill);
        assertThat(result).isEqualTo(expected);
    }

}
