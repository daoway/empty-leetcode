package com.blogspot.ostas.leetcode.all.medium.reverse_words_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "the sky is blue"
    Output: "blue is sky the"
    Example 2:
    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.
    Example 3:
    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
      Constraints:
    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.
      Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "the sky is blue";
        String expected = "blue is sky the";
        var result = solution.reverseWords(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "  hello world  ";
        String expected = "world hello";
        var result = solution.reverseWords(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "a good   example";
        String expected = "example good a";
        var result = solution.reverseWords(s);
        assertThat(result).isEqualTo(expected);
    }

}
