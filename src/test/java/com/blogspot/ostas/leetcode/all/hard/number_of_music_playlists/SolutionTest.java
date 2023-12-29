package com.blogspot.ostas.leetcode.all.hard.number_of_music_playlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, goal = 3, k = 1
    Output: 6
    Explanation: There are 6 possible playlists: [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], and [3, 2, 1].
    Example 2:
    Input: n = 2, goal = 3, k = 0
    Output: 6
    Explanation: There are 6 possible playlists: [1, 1, 2], [1, 2, 1], [2, 1, 1], [2, 2, 1], [2, 1, 2], and [1, 2, 2].
    Example 3:
    Input: n = 2, goal = 3, k = 1
    Output: 2
    Explanation: There are 2 possible playlists: [1, 2, 1] and [2, 1, 2].
      Constraints:
    0 <= k < n <= goal <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int goal = 3;
        int k = 1;
        int expected = 6;
        var result = solution.numMusicPlaylists(n, goal, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int goal = 3;
        int k = 0;
        int expected = 6;
        var result = solution.numMusicPlaylists(n, goal, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int goal = 3;
        int k = 1;
        int expected = 2;
        var result = solution.numMusicPlaylists(n, goal, k);
        assertThat(result).isEqualTo(expected);
    }

}
