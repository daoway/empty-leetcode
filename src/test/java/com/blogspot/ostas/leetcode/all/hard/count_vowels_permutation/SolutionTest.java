package com.blogspot.ostas.leetcode.all.hard.count_vowels_permutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 5
    Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
    Example 2:
    Input: n = 2
    Output: 10
    Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
    Example 3:
    Input: n = 5
    Output: 68
      Constraints:
    1 <= n <= 2 * 10^4
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int expected = 5;
        var result = solution.countVowelPermutation(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 10;
        var result = solution.countVowelPermutation(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int expected = 68;
        var result = solution.countVowelPermutation(n);
        assertThat(result).isEqualTo(expected);
    }

}
