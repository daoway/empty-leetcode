package com.blogspot.ostas.leetcode.all.easy.determine_color_of_a_chessboard_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: coordinates = "a1"
    Output: false
    Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
    Example 2:
    Input: coordinates = "h3"
    Output: true
    Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
    Example 3:
    Input: coordinates = "c7"
    Output: false
      Constraints:
    coordinates.length == 2
    'a' <= coordinates[0] <= 'h'
    '1' <= coordinates[1] <= '8'
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String coordinates = "a1";
        boolean expected = false;
        var result = solution.squareIsWhite(coordinates);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String coordinates = "h3";
        boolean expected = true;
        var result = solution.squareIsWhite(coordinates);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String coordinates = "c7";
        boolean expected = false;
        var result = solution.squareIsWhite(coordinates);
        assertThat(result).isEqualTo(expected);
    }

}
