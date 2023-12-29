package com.blogspot.ostas.leetcode.all.medium.count_unhappy_friends;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, preferences = [[1, 2, 3], [3, 2, 0], [3, 1, 0], [1, 2, 0]], pairs = [[0, 1], [2, 3]]
    Output: 2
    Explanation:
    Friend 1 is unhappy because:
    - 1 is paired with 0 but prefers 3 over 0, and
    - 3 prefers 1 over 2.
    Friend 3 is unhappy because:
    - 3 is paired with 2 but prefers 1 over 2, and
    - 1 prefers 3 over 0.
    Friends 0 and 2 are happy.
    Example 2:
    Input: n = 2, preferences = [[1], [0]], pairs = [[1, 0]]
    Output: 0
    Explanation: Both friends 0 and 1 are happy.
    Example 3:
    Input: n = 4, preferences = [[1, 3, 2], [2, 3, 0], [1, 3, 0], [0, 2, 1]], pairs = [[1, 3], [0, 2]]
    Output: 4
      Constraints:
    2 <= n <= 500
    n is even.
    preferences.length == n
    preferences[i].length == n - 1
    0 <= preferences[i][j] <= n - 1
    preferences[i] does not contain i.
    All values in preferences[i] are unique.
    pairs.length == n/2
    pairs[i].length == 2
    xi != yi
    0 <= xi, yi <= n - 1
    Each person is contained in exactly one pair.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] preferences = new int[][]{{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}};
        int[][] pairs = new int[][]{{0, 1}, {2, 3}};
        int expected = 2;
        var result = solution.unhappyFriends(n, preferences, pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] preferences = new int[][]{{1}, {0}};
        int[][] pairs = new int[][]{{1, 0}};
        int expected = 0;
        var result = solution.unhappyFriends(n, preferences, pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int[][] preferences = new int[][]{{1, 3, 2}, {2, 3, 0}, {1, 3, 0}, {0, 2, 1}};
        int[][] pairs = new int[][]{{1, 3}, {0, 2}};
        int expected = 4;
        var result = solution.unhappyFriends(n, preferences, pairs);
        assertThat(result).isEqualTo(expected);
    }


}
