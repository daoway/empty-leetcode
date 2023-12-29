package com.blogspot.ostas.leetcode.all.medium.maximum_white_tiles_covered_by_a_carpet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tiles = [[1,5],[10,11],[12,18],[20,25],[30,32]], carpetLen = 10
    Output: 9
    Explanation: Place the carpet starting on tile 10.
    It covers 9 white tiles, so we return 9.
    Note that there may be other places where the carpet covers 9 white tiles.
    It can be shown that the carpet cannot cover more than 9 white tiles.
    Example 2:
    Input: tiles = [[10,11],[1,1]], carpetLen = 2
    Output: 2
    Explanation: Place the carpet starting on tile 10.
    It covers 2 white tiles, so we return 2.
      Constraints:
    1 <= tiles.length <= 5 * 104
    tiles[i].length == 2
    1 <= li <= ri <= 109
    1 <= carpetLen <= 109
    The tiles are non-overlapping.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] tiles = new int[][]{{1, 5}, {10, 11}, {12, 18}, {20, 25}, {30, 32}};
        int carpetLen = 10;
        int expected = 9;
        var result = solution.maximumWhiteTiles(tiles, carpetLen);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] tiles = new int[][]{{10, 11}, {1, 1}};
        int carpetLen = 2;
        int expected = 2;
        var result = solution.maximumWhiteTiles(tiles, carpetLen);
        assertThat(result).isEqualTo(expected);
    }

}
