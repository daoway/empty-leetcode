package com.blogspot.ostas.leetcode.all.medium.k_th_symbol_in_grammar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, k = 1
    Output: 0
    Explanation: row 1: 0
    Example 2:
    Input: n = 2, k = 1
    Output: 0
    Explanation:
    row 1: 0
    row 2: 01
    Example 3:
    Input: n = 2, k = 2
    Output: 1
    Explanation:
    row 1: 0
    row 2: 01
      Constraints:
    1 <= n <= 30
    1 <= k <= 2n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int k = 1;
        int expected = 0;
        var result = solution.kthGrammar(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int k = 1;
        int expected = 0;
        var result = solution.kthGrammar(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int k = 2;
        int expected = 1;
        var result = solution.kthGrammar(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
