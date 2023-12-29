package com.blogspot.ostas.leetcode.all.medium.can_i_win;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: maxChoosableInteger = 10, desiredTotal = 11
    Output: false
    Explanation:
    No matter which integer the first player choose, the first player will lose.
    The first player can choose an integer from 1 up to 10.
    If the first player choose 1, the second player can only choose integers from 2 up to 10.
    The second player will win by choosing 10 and get a total = 11, which is >= desiredTotal.
    Same with other integers chosen by the first player, the second player will always win.
    Example 2:
    Input: maxChoosableInteger = 10, desiredTotal = 0
    Output: true
    Example 3:
    Input: maxChoosableInteger = 10, desiredTotal = 1
    Output: true
      Constraints:
    1 <= maxChoosableInteger <= 20
    0 <= desiredTotal <= 300
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int maxChoosableInteger = 10;
        int desiredTotal = 11;
        boolean expected = false;
        var result = solution.canIWin(maxChoosableInteger, desiredTotal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int maxChoosableInteger = 10;
        int desiredTotal = 0;
        boolean expected = true;
        var result = solution.canIWin(maxChoosableInteger, desiredTotal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int maxChoosableInteger = 10;
        int desiredTotal = 1;
        boolean expected = true;
        var result = solution.canIWin(maxChoosableInteger, desiredTotal);
        assertThat(result).isEqualTo(expected);
    }

}
