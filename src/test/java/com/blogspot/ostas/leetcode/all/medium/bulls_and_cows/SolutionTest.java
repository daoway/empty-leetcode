package com.blogspot.ostas.leetcode.all.medium.bulls_and_cows;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: secret = "1807", guess = "7810"
    Output: "1A3B"
    Explanation: Bulls are connected with a '|' and cows are underlined:
    "1807"
      |
    "7810"
    Example 2:
    Input: secret = "1123", guess = "0111"
    Output: "1A1B"
    Explanation: Bulls are connected with a '|' and cows are underlined:
    "1123"        "1123"
      |      or     |
    "0111"        "0111"
    Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.
      Constraints:
    1 <= secret.length, guess.length <= 1000
    secret.length == guess.length
    secret and guess consist of digits only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String secret = "1807";
        String guess = "7810";
        String expected = "1A3B";
        var result = solution.getHint(secret, guess);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String secret = "1123";
        String guess = "0111";
        String expected = "1A1B";
        var result = solution.getHint(secret, guess);
        assertThat(result).isEqualTo(expected);
    }

}
