package com.blogspot.ostas.leetcode.all.medium.sum_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "5023"
    Output: false
    Explanation: There are no moves to be made.
    The sum of the first half is equal to the sum of the second half: 5 + 0 = 2 + 3.
    Example 2:
    Input: num = "25??"
    Output: true
    Explanation: Alice can replace one of the '?'s with '9' and it will be impossible for Bob to make the sums equal.
    Example 3:
    Input: num = "?3295???"
    Output: false
    Explanation: It can be proven that Bob will always win. One possible outcome is:
    - Alice replaces the first '?' with '9'. num = "93295???".
    - Bob replaces one of the '?' in the right half with '9'. num = "932959??".
    - Alice replaces one of the '?' in the right half with '2'. num = "9329592?".
    - Bob replaces the last '?' in the right half with '7'. num = "93295927".
    Bob wins because 9 + 3 + 2 + 9 = 5 + 9 + 2 + 7.
      Constraints:
    2 <= num.length <= 105
    num.length is even.
    num consists of only digits and '?'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "5023";
        boolean expected = false;
        var result = solution.sumGame(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "25??";
        boolean expected = true;
        var result = solution.sumGame(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "?3295???";
        boolean expected = false;
        var result = solution.sumGame(num);
        assertThat(result).isEqualTo(expected);
    }

}
