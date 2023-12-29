package com.blogspot.ostas.leetcode.all.medium.remove_colored_pieces_if_both_neighbors_are_the_same_color;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: colors = "AAABABB"
    Output: true
    Explanation:
    AAABABB -> AABABB
    Alice moves first.
    She removes the second 'A' from the left since that is the only 'A' whose neighbors are both 'A'.

    Now it's Bob's turn.
    Bob cannot make a move on his turn since there are no 'B's whose neighbors are both 'B'.
    Thus, Alice wins, so return true.
    Example 2:
    Input: colors = "AA"
    Output: false
    Explanation:
    Alice has her turn first.
    There are only two 'A's and both are on the edge of the line, so she cannot move on her turn.
    Thus, Bob wins, so return false.
    Example 3:
    Input: colors = "ABBBBBBBAAA"
    Output: false
    Explanation:
    ABBBBBBBAAA -> ABBBBBBBAA
    Alice moves first.
    Her only option is to remove the second to last 'A' from the right.

    ABBBBBBBAA -> ABBBBBBAA
    Next is Bob's turn.
    He has many options for which 'B' piece to remove. He can pick any.

    On Alice's second turn, she has no more pieces that she can remove.
    Thus, Bob wins, so return false.
      Constraints:
    1 <= colors.length <= 105
    colors consists of only the letters 'A' and 'B'
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String colors = "AAABABB";
        boolean expected = true;
        var result = solution.winnerOfGame(colors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String colors = "AA";
        boolean expected = false;
        var result = solution.winnerOfGame(colors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String colors = "ABBBBBBBAAA";
        boolean expected = false;
        var result = solution.winnerOfGame(colors);
        assertThat(result).isEqualTo(expected);
    }

}
