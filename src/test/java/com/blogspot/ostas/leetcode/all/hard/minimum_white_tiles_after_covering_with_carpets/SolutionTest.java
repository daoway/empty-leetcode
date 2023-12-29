package com.blogspot.ostas.leetcode.all.hard.minimum_white_tiles_after_covering_with_carpets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: floor = "10110101", numCarpets = 2, carpetLen = 2
    Output: 2
    Explanation:
    The figure above shows one way of covering the tiles with the carpets such that only 2 white tiles are visible.
    No other way of covering the tiles with the carpets can leave less than 2 white tiles visible.
    Example 2:
    Input: floor = "11111", numCarpets = 2, carpetLen = 3
    Output: 0
    Explanation:
    The figure above shows one way of covering the tiles with the carpets such that no white tiles are visible.
    Note that the carpets are able to overlap one another.
      Constraints:
    1 <= carpetLen <= floor.length <= 1000
    floor[i] is either '0' or '1'.
    1 <= numCarpets <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String floor = "10110101";
        int numCarpets = 2;
        int carpetLen = 2;
        int expected = 2;
        var result = solution.minimumWhiteTiles(floor, numCarpets, carpetLen);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String floor = "11111";
        int numCarpets = 2;
        int carpetLen = 3;
        int expected = 0;
        var result = solution.minimumWhiteTiles(floor, numCarpets, carpetLen);
        assertThat(result).isEqualTo(expected);
    }

}
