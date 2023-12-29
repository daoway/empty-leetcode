package com.blogspot.ostas.leetcode.all.easy.distribute_candies_among_children_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, limit = 2
    Output: 3
    Explanation: There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2) and (2, 2, 1).
    Example 2:
    Input: n = 3, limit = 3
    Output: 10
    Explanation: There are 10 ways to distribute 3 candies such that no child gets more than 3 candies: (0, 0, 3), (0, 1, 2), (0, 2, 1), (0, 3, 0), (1, 0, 2), (1, 1, 1), (1, 2, 0), (2, 0, 1), (2, 1, 0) and (3, 0, 0).
      Constraints:
    1 <= n <= 50
    1 <= limit <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int limit = 2;
        int expected = 3;
        var result = solution.distributeCandies(n, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int limit = 3;
        int expected = 10;
        var result = solution.distributeCandies(n, limit);
        assertThat(result).isEqualTo(expected);
    }

}
