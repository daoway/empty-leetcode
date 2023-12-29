package com.blogspot.ostas.leetcode.all.medium.decode_the_slanted_ciphertext;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: encodedText = "ch   ie   pr", rows = 3
    Output: "cipher"
    Explanation: This is the same example described in the problem description.
    Example 2:
    Input: encodedText = "iveo    eed   l te   olc", rows = 4
    Output: "i love leetcode"
    Explanation: The figure above denotes the matrix that was used to encode originalText.
    The blue arrows show how we can find originalText from encodedText.
    Example 3:
    Input: encodedText = "coding", rows = 1
    Output: "coding"
    Explanation: Since there is only 1 row, both originalText and encodedText are the same.
      Constraints:
    0 <= encodedText.length <= 106
    encodedText consists of lowercase English letters and ' ' only.
    encodedText is a valid encoding of some originalText that does not have trailing spaces.
    1 <= rows <= 1000
    The testcases are generated such that there is only one possible originalText.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String encodedText = "ch   ie   pr";
        int rows = 3;
        String expected = "cipher";
        var result = solution.decodeCiphertext(encodedText, rows);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String encodedText = "iveo    eed   l te   olc";
        int rows = 4;
        String expected = "i love leetcode";
        var result = solution.decodeCiphertext(encodedText, rows);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String encodedText = "coding";
        int rows = 1;
        String expected = "coding";
        var result = solution.decodeCiphertext(encodedText, rows);
        assertThat(result).isEqualTo(expected);
    }

}
