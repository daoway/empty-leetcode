package com.blogspot.ostas.leetcode.all.easy.prime_arrangements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 12
    Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1] is not because the prime number 5 is at index 1.
    Example 2:
    Input: n = 100
    Output: 682289015
      Constraints:
    1 <= n <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 12;
        var result = solution.numPrimeArrangements(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 100;
        int expected = 682289015;
        var result = solution.numPrimeArrangements(n);
        assertThat(result).isEqualTo(expected);
    }

}
