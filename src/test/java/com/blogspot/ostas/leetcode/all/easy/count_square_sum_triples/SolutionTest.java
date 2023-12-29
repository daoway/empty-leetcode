package com.blogspot.ostas.leetcode.all.easy.count_square_sum_triples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 2
    Explanation: The square triples are (3,4,5) and (4,3,5).
    Example 2:
    Input: n = 10
    Output: 4
    Explanation: The square triples are (3,4,5), (4,3,5), (6,8,10), and (8,6,10).
      Constraints:
    1 <= n <= 250
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 2;
        var result = solution.countTriples(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        int expected = 4;
        var result = solution.countTriples(n);
        assertThat(result).isEqualTo(expected);
    }

}
