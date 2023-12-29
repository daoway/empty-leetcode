package com.blogspot.ostas.leetcode.all.hard.number_of_valid_move_combinations_on_chessboard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pieces = ["rook"], positions = [[1,1]]
    Output: 15
    Explanation: The image above shows the possible squares the piece can move to.
    Example 2:
    Input: pieces = ["queen"], positions = [[1,1]]
    Output: 22
    Explanation: The image above shows the possible squares the piece can move to.
    Example 3:
    Input: pieces = ["bishop"], positions = [[4,3]]
    Output: 12
    Explanation: The image above shows the possible squares the piece can move to.
      Constraints:
    n == pieces.length
    n == positions.length
    1 <= n <= 4
    pieces only contains the strings "rook", "queen", and "bishop".
    There will be at most one queen on the chessboard.
    1 <= xi, yi <= 8
    Each positions[i] is distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] pieces = new String[]{"rook"};
        int[][] positions = new int[][]{{1, 1}};
        int expected = 15;
        var result = solution.countCombinations(pieces, positions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] pieces = new String[]{"queen"};
        int[][] positions = new int[][]{{1, 1}};
        int expected = 22;
        var result = solution.countCombinations(pieces, positions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] pieces = new String[]{"bishop"};
        int[][] positions = new int[][]{{4, 3}};
        int expected = 12;
        var result = solution.countCombinations(pieces, positions);
        assertThat(result).isEqualTo(expected);
    }

}
