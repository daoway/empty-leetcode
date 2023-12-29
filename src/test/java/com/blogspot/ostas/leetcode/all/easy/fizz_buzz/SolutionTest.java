package com.blogspot.ostas.leetcode.all.easy.fizz_buzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: ["1","2","Fizz"]
    Example 2:
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]
    Example 3:
    Input: n = 15
    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        List<String> expected = List.of("1", "2", "Fizz");
        var result = solution.fizzBuzz(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        var result = solution.fizzBuzz(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 15;
        List<String> expected =
                List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                        "13", "14", "FizzBuzz");
        var result = solution.fizzBuzz(n);
        assertThat(result).isEqualTo(expected);
    }

}
