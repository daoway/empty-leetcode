package com.blogspot.ostas.leetcode.all.medium.champagne_tower;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: poured = 1, query_row = 1, query_glass = 1
    Output: 0.00000
    Explanation: We poured 1 cup of champange to the top glass of the tower (which is indexed as (0, 0)). There will be no excess liquid so all the glasses under the top glass will remain empty.
    Example 2:
    Input: poured = 2, query_row = 1, query_glass = 1
    Output: 0.50000
    Explanation: We poured 2 cups of champange to the top glass of the tower (which is indexed as (0, 0)). There is one cup of excess liquid. The glass indexed as (1, 0) and the glass indexed as (1, 1) will share the excess liquid equally, and each will get half cup of champange.
    Example 3:
    Input: poured = 100000009, query_row = 33, query_glass = 17
    Output: 1.00000
      Constraints:
    0 <= poured <= 109
    0 <= query_glass <= query_row < 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int poured = 1;
        int query_row = 1;
        int query_glass = 1;
        double expected = 0.00000;
        var result = solution.champagneTower(poured, query_row, query_glass);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int poured = 2;
        int query_row = 1;
        int query_glass = 1;
        double expected = 0.50000;
        var result = solution.champagneTower(poured, query_row, query_glass);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int poured = 100000009;
        int query_row = 33;
        int query_glass = 17;
        double expected = 1.00000;
        var result = solution.champagneTower(poured, query_row, query_glass);
        assertThat(result).isEqualTo(expected);
    }

}
