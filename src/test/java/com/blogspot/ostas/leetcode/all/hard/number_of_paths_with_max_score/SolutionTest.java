package com.blogspot.ostas.leetcode.all.hard.number_of_paths_with_max_score;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = ["E23","2X2","12S"]
    Output: [7,1]
    Example 2:
    Input: board = ["E12","1X1","21S"]
    Output: [4,2]
    Example 3:
    Input: board = ["E11","XXX","11S"]
    Output: [0,0]
      Constraints:
    2 <= board.length == board[i].length <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<String> board = List.of("E23", "2X2", "12S");
        int[] expected = new int[]{7, 1};
        var result = solution.pathsWithMaxScore(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<String> board = List.of("E12", "1X1", "21S");
        int[] expected = new int[]{4, 2};
        var result = solution.pathsWithMaxScore(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<String> board = List.of("E11", "XXX", "11S");
        int[] expected = new int[]{0, 0};
        var result = solution.pathsWithMaxScore(board);
        assertThat(result).isEqualTo(expected);
    }

}
