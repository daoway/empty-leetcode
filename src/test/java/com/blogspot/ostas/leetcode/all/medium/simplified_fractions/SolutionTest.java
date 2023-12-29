package com.blogspot.ostas.leetcode.all.medium.simplified_fractions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: ["1/2"]
    Explanation: "1/2" is the only unique fraction with a denominator less-than-or-equal-to 2.
    Example 2:
    Input: n = 3
    Output: ["1/2","1/3","2/3"]
    Example 3:
    Input: n = 4
    Output: ["1/2","1/3","1/4","2/3","3/4"]
    Explanation: "2/4" is not a simplified fraction because it can be simplified to "1/2".
      Constraints:
    1 <= n <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        List<String> expected = List.of("1/2");
        var result = solution.simplifiedFractions(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        List<String> expected = List.of("1/2", "1/3", "2/3");
        var result = solution.simplifiedFractions(n);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        List<String> expected = List.of("1/2", "1/3", "1/4", "2/3", "3/4");
        var result = solution.simplifiedFractions(n);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
