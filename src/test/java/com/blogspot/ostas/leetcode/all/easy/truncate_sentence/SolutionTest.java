package com.blogspot.ostas.leetcode.all.easy.truncate_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "Hello how are you Contestant", k = 4
    Output: "Hello how are you"
    Explanation:
    The words in s are ["Hello", "how" "are", "you", "Contestant"].
    The first 4 words are ["Hello", "how", "are", "you"].
    Hence, you should return "Hello how are you".
    Example 2:
    Input: s = "What is the solution to this problem", k = 4
    Output: "What is the solution"
    Explanation:
    The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
    The first 4 words are ["What", "is", "the", "solution"].
    Hence, you should return "What is the solution".
    Example 3:
    Input: s = "chopper is not a tanuki", k = 5
    Output: "chopper is not a tanuki"
      Constraints:
    1 <= s.length <= 500
    k is in the range [1, the number of words in s].
    s consist of only lowercase and uppercase English letters and spaces.
    The words in s are separated by a single space.
    There are no leading or trailing spaces.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "Hello how are you Contestant";
        int k = 4;
        String expected = "Hello how are you";
        var result = solution.truncateSentence(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "What is the solution to this problem";
        int k = 4;
        String expected = "What is the solution";
        var result = solution.truncateSentence(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "chopper is not a tanuki";
        int k = 5;
        String expected = "chopper is not a tanuki";
        var result = solution.truncateSentence(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
