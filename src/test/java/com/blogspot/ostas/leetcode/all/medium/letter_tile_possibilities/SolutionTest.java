package com.blogspot.ostas.leetcode.all.medium.letter_tile_possibilities;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tiles = "AAB"
    Output: 8
    Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
    Example 2:
    Input: tiles = "AAABBC"
    Output: 188
    Example 3:
    Input: tiles = "V"
    Output: 1
      Constraints:
    1 <= tiles.length <= 7
    tiles consists of uppercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String tiles = "AAB";
        int expected = 8;
        var result = solution.numTilePossibilities(tiles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String tiles = "AAABBC";
        int expected = 188;
        var result = solution.numTilePossibilities(tiles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String tiles = "V";
        int expected = 1;
        var result = solution.numTilePossibilities(tiles);
        assertThat(result).isEqualTo(expected);
    }

}
