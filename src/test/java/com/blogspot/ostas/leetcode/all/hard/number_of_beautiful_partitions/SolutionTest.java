package com.blogspot.ostas.leetcode.all.hard.number_of_beautiful_partitions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "23542185131", k = 3, minLength = 2
    Output: 3
    Explanation: There exists three ways to create a beautiful partition:
    "2354 | 218 | 5131"
    "2354 | 21851 | 31"
    "2354218 | 51 | 31"
    Example 2:
    Input: s = "23542185131", k = 3, minLength = 3
    Output: 1
    Explanation: There exists one way to create a beautiful partition: "2354 | 218 | 5131".
    Example 3:
    Input: s = "3312958", k = 3, minLength = 1
    Output: 1
    Explanation: There exists one way to create a beautiful partition: "331 | 29 | 58".
      Constraints:
    1 <= k, minLength <= s.length <= 1000
    s consists of the digits '1' to '9'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "23542185131";
        int k = 3;
        int minLength = 2;
        int expected = 3;
        var result = solution.beautifulPartitions(s, k, minLength);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "23542185131";
        int k = 3;
        int minLength = 3;
        int expected = 1;
        var result = solution.beautifulPartitions(s, k, minLength);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "3312958";
        int k = 3;
        int minLength = 1;
        int expected = 1;
        var result = solution.beautifulPartitions(s, k, minLength);
        assertThat(result).isEqualTo(expected);
    }

}
