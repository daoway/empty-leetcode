package com.blogspot.ostas.leetcode.all.easy.minimum_moves_to_convert_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "XXX"
    Output: 1
    Explanation: XXX -> OOO
    We select all the 3 characters and convert them in one move.
    Example 2:
    Input: s = "XXOX"
    Output: 2
    Explanation: XXOX -> OOOX -> OOOO
    We select the first 3 characters in the first move, and convert them to 'O'.
    Then we select the last 3 characters and convert them so that the final string contains all 'O's.
    Example 3:
    Input: s = "OOOO"
    Output: 0
    Explanation: There are no 'X's in s to convert.
      Constraints:
    3 <= s.length <= 1000
    s[i] is either 'X' or 'O'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "XXX";
        int expected = 1;
        var result = solution.minimumMoves(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "XXOX";
        int expected = 2;
        var result = solution.minimumMoves(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "OOOO";
        int expected = 0;
        var result = solution.minimumMoves(s);
        assertThat(result).isEqualTo(expected);
    }

}
