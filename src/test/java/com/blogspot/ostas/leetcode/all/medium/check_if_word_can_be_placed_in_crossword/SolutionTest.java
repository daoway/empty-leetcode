package com.blogspot.ostas.leetcode.all.medium.check_if_word_can_be_placed_in_crossword;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = [["#", " ", "#"], [" ", " ", "#"], ["#", "c", " "]], word = "abc"
    Output: true
    Explanation: The word "abc" can be placed as shown above (top to bottom).
    Example 2:
    Input: board = [[" ", "#", "a"], [" ", "#", "c"], [" ", "#", "a"]], word = "ac"
    Output: false
    Explanation: It is impossible to place the word because there will always be a space/letter above or below it.
    Example 3:
    Input: board = [["#", " ", "#"], [" ", " ", "#"], ["#", " ", "c"]], word = "ca"
    Output: true
    Explanation: The word "ca" can be placed as shown above (right to left).
      Constraints:
    m == board.length
    n == board[i].length
    1 <= m * n <= 2 * 105
    board[i][j] will be ' ', '#', or a lowercase English letter.
    1 <= word.length <= max(m, n)
    word will contain only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] board = {
                {'#', ' ', '#'},
                {' ', ' ', '#'},
                {'#', 'c', ' '}
        };
        String word = "abc";
        boolean expected = true;
        var result = solution.placeWordInCrossword(board, word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] board = {
                {' ', '#', 'a'},
                {' ', '#', 'c'},
                {' ', '#', 'a'}
        };
        String word = "ac";
        boolean expected = false;
        var result = solution.placeWordInCrossword(board, word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        char[][] board = {
                {'#', ' ', '#'},
                {' ', ' ', '#'},
                {'#', ' ', 'c'}
        };
        String word = "ca";
        boolean expected = true;
        var result = solution.placeWordInCrossword(board, word);
        assertThat(result).isEqualTo(expected);
    }


}
