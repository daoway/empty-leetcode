package com.blogspot.ostas.leetcode.all.medium.count_number_of_teams;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rating = [2,5,3,4,1]
    Output: 3
    Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
    Example 2:
    Input: rating = [2,1,3]
    Output: 0
    Explanation: We can't form any team given the conditions.
    Example 3:
    Input: rating = [1,2,3,4]
    Output: 4
      Constraints:
    n == rating.length
    3 <= n <= 1000
    1 <= rating[i] <= 105
    All the integers in rating are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rating = new int[]{2, 5, 3, 4, 1};
        int expected = 3;
        var result = solution.numTeams(rating);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rating = new int[]{2, 1, 3};
        int expected = 0;
        var result = solution.numTeams(rating);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] rating = new int[]{1, 2, 3, 4};
        int expected = 4;
        var result = solution.numTeams(rating);
        assertThat(result).isEqualTo(expected);
    }

}
