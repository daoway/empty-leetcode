package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_people_to_teach;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, languages = [[1],[2],[1,2]], friendships = [[1,2],[1,3],[2,3]]
    Output: 1
    Explanation: You can either teach user 1 the second language or user 2 the first language.
    Example 2:
    Input: n = 3, languages = [[2],[1,3],[1,2],[3]], friendships = [[1,4],[1,2],[3,4],[2,3]]
    Output: 2
    Explanation: Teach the third language to users 1 and 3, yielding two users to teach.
      Constraints:
    2 <= n <= 500
    languages.length == m
    1 <= m <= 500
    1 <= languages[i].length <= n
    1 <= languages[i][j] <= n
    1 <= ui < vi <= languages.length
    1 <= friendships.length <= 500
    All tuples (ui, vi) are unique
    languages[i] contains only unique values
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[][] languages = new int[][]{{1}, {2}, {1, 2}};
        int[][] friendships = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        int expected = 1;
        var result = solution.minimumTeachings(n, languages, friendships);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] languages = new int[][]{{2}, {1, 3}, {1, 2}, {3}};
        int[][] friendships = new int[][]{{1, 4}, {1, 2}, {3, 4}, {2, 3}};
        int expected = 2;
        var result = solution.minimumTeachings(n, languages, friendships);
        assertThat(result).isEqualTo(expected);
    }

}
