package com.blogspot.ostas.leetcode.all.hard.number_of_unique_good_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: binary = "001"
    Output: 2
    Explanation: The good subsequences of binary are ["0", "0", "1"].
    The unique good subsequences are "0" and "1".
    Example 2:
    Input: binary = "11"
    Output: 2
    Explanation: The good subsequences of binary are ["1", "1", "11"].
    The unique good subsequences are "1" and "11".
    Example 3:
    Input: binary = "101"
    Output: 5
    Explanation: The good subsequences of binary are ["1", "0", "1", "10", "11", "101"].
    The unique good subsequences are "0", "1", "10", "11", and "101".
      Constraints:
    1 <= binary.length <= 105
    binary consists of only '0's and '1's.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String binary = "001";
        int expected = 2;
        var result = solution.numberOfUniqueGoodSubsequences(binary);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String binary = "11";
        int expected = 2;
        var result = solution.numberOfUniqueGoodSubsequences(binary);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String binary = "101";
        int expected = 5;
        var result = solution.numberOfUniqueGoodSubsequences(binary);
        assertThat(result).isEqualTo(expected);
    }

}
