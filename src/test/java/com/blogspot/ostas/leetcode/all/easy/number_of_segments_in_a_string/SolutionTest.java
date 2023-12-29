package com.blogspot.ostas.leetcode.all.easy.number_of_segments_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "Hello, my name is John"
    Output: 5
    Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
    Example 2:
    Input: s = "Hello"
    Output: 1
      Constraints:
    0 <= s.length <= 300
    s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
    The only space character in s is ' '.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "Hello, my name is John";
        int expected = 5;
        var result = solution.countSegments(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "Hello";
        int expected = 1;
        var result = solution.countSegments(s);
        assertThat(result).isEqualTo(expected);
    }

}
