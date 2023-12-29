package com.blogspot.ostas.leetcode.all.medium.maximum_score_from_removing_stones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 2, b = 4, c = 6
    Output: 6
    Explanation: The starting state is (2, 4, 6). One optimal set of moves is:
    - Take from 1st and 3rd piles, state is now (1, 4, 5)
    - Take from 1st and 3rd piles, state is now (0, 4, 4)
    - Take from 2nd and 3rd piles, state is now (0, 3, 3)
    - Take from 2nd and 3rd piles, state is now (0, 2, 2)
    - Take from 2nd and 3rd piles, state is now (0, 1, 1)
    - Take from 2nd and 3rd piles, state is now (0, 0, 0)
    There are fewer than two non-empty piles, so the game ends. Total: 6 points.
    Example 2:
    Input: a = 4, b = 4, c = 6
    Output: 7
    Explanation: The starting state is (4, 4, 6). One optimal set of moves is:
    - Take from 1st and 2nd piles, state is now (3, 3, 6)
    - Take from 1st and 3rd piles, state is now (2, 3, 5)
    - Take from 1st and 3rd piles, state is now (1, 3, 4)
    - Take from 1st and 3rd piles, state is now (0, 3, 3)
    - Take from 2nd and 3rd piles, state is now (0, 2, 2)
    - Take from 2nd and 3rd piles, state is now (0, 1, 1)
    - Take from 2nd and 3rd piles, state is now (0, 0, 0)
    There are fewer than two non-empty piles, so the game ends. Total: 7 points.
    Example 3:
    Input: a = 1, b = 8, c = 8
    Output: 8
    Explanation: One optimal set of moves is to take from the 2nd and 3rd piles for 8 turns until they are empty.
    After that, there are fewer than two non-empty piles, so the game ends.
      Constraints:
    1 <= a, b, c <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 2;
        int b = 4;
        int c = 6;
        int expected = 6;
        var result = solution.maximumScore(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 4;
        int b = 4;
        int c = 6;
        int expected = 7;
        var result = solution.maximumScore(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int a = 1;
        int b = 8;
        int c = 8;
        int expected = 8;
        var result = solution.maximumScore(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

}
