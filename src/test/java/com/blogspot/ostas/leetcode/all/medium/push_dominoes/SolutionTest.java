package com.blogspot.ostas.leetcode.all.medium.push_dominoes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: dominoes = "RR.L"
    Output: "RR.L"
    Explanation: The first domino expends no additional force on the second domino.
    Example 2:
    Input: dominoes = ".L.R...LR..L.."
    Output: "LL.RR.LLRRLL.."
      Constraints:
    n == dominoes.length
    1 <= n <= 105
    dominoes[i] is either 'L', 'R', or '.'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String dominoes = "RR.L";
        String expected = "RR.L";
        var result = solution.pushDominoes(dominoes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String dominoes = ".L.R...LR..L..";
        String expected = "LL.RR.LLRRLL..";
        var result = solution.pushDominoes(dominoes);
        assertThat(result).isEqualTo(expected);
    }

}
