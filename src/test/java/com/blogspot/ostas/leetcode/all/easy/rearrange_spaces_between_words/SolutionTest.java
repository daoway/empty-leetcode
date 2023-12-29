package com.blogspot.ostas.leetcode.all.easy.rearrange_spaces_between_words;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "  this   is  a sentence "
    Output: "this   is   a   sentence"
    Explanation: There are a total of 9 spaces and 4 words. We can evenly divide the 9 spaces between the words: 9 / (4-1) = 3 spaces.
    Example 2:
    Input: text = " practice   makes   perfect"
    Output: "practice   makes   perfect "
    Explanation: There are a total of 7 spaces and 3 words. 7 / (3-1) = 3 spaces plus 1 extra space. We place this extra space at the end of the string.
      Constraints:
    1 <= text.length <= 100
    text consists of lowercase English letters and ' '.
    text contains at least one word.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "  this   is  a sentence ";
        String expected = "this   is   a   sentence";
        var result = solution.reorderSpaces(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = " practice   makes   perfect";
        String expected = "practice   makes   perfect ";
        var result = solution.reorderSpaces(text);
        assertThat(result).isEqualTo(expected);
    }

}
