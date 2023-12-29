package com.blogspot.ostas.leetcode.all.medium.split_array_into_fibonacci_sequence;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "1101111"
    Output: [11,0,11,11]
    Explanation: The output [110, 1, 111] would also be accepted.
    Example 2:
    Input: num = "112358130"
    Output: []
    Explanation: The task is impossible.
    Example 3:
    Input: num = "0123"
    Output: []
    Explanation: Leading zeroes are not allowed, so "01", "2", "3" is not valid.
      Constraints:
    1 <= num.length <= 200
    num contains only digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "1101111";
        List<Integer> expected = List.of(11, 0, 11, 11);
        var result = solution.splitIntoFibonacci(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "112358130";
        List<Integer> expected = List.of();
        var result = solution.splitIntoFibonacci(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "0123";
        List<Integer> expected = List.of();
        var result = solution.splitIntoFibonacci(num);
        assertThat(result).isEqualTo(expected);
    }

}
