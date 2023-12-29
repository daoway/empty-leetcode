package com.blogspot.ostas.leetcode.all.medium.minimum_additions_to_make_valid_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "b"
    Output: 2
    Explanation: Insert the letter "a" right before "b", and the letter "c" right next to "a" to obtain the valid string "abc".
    Example 2:
    Input: word = "aaa"
    Output: 6
    Explanation: Insert letters "b" and "c" next to each "a" to obtain the valid string "abcabcabc".
    Example 3:
    Input: word = "abc"
    Output: 0
    Explanation: word is already valid. No modifications are needed.
      Constraints:
    1 <= word.length <= 50
    word consists of letters "a", "b" and "c" only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "b";
        int expected = 2;
        var result = solution.addMinimum(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "aaa";
        int expected = 6;
        var result = solution.addMinimum(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "abc";
        int expected = 0;
        var result = solution.addMinimum(word);
        assertThat(result).isEqualTo(expected);
    }

}
