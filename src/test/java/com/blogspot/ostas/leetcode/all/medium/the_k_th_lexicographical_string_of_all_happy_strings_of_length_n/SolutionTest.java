package com.blogspot.ostas.leetcode.all.medium.the_k_th_lexicographical_string_of_all_happy_strings_of_length_n;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, k = 3
    Output: "c"
    Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
    Example 2:
    Input: n = 1, k = 4
    Output: ""
    Explanation: There are only 3 happy strings of length 1.
    Example 3:
    Input: n = 3, k = 9
    Output: "cab"
    Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"
      Constraints:
    1 <= n <= 10
    1 <= k <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int k = 3;
        String expected = "c";
        var result = solution.getHappyString(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int k = 4;
        String expected = "";
        var result = solution.getHappyString(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int k = 9;
        String expected = "cab";
        var result = solution.getHappyString(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
