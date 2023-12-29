package com.blogspot.ostas.leetcode.all.easy.circular_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sentence = "leetcode exercises sound delightful"
    Output: true
    Explanation: The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
    - leetcode's last character is equal to exercises's first character.
    - exercises's last character is equal to sound's first character.
    - sound's last character is equal to delightful's first character.
    - delightful's last character is equal to leetcode's first character.
    The sentence is circular.
    Example 2:
    Input: sentence = "eetcode"
    Output: true
    Explanation: The words in sentence are ["eetcode"].
    - eetcode's last character is equal to eetcode's first character.
    The sentence is circular.
    Example 3:
    Input: sentence = "Leetcode is cool"
    Output: false
    Explanation: The words in sentence are ["Leetcode", "is", "cool"].
    - Leetcode's last character is not equal to is's first character.
    The sentence is not circular.
      Constraints:
    1 <= sentence.length <= 500
    sentence consist of only lowercase and uppercase English letters and spaces.
    The words in sentence are separated by a single space.
    There are no leading or trailing spaces.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sentence = "leetcode exercises sound delightful";
        boolean expected = true;
        var result = solution.isCircularSentence(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sentence = "eetcode";
        boolean expected = true;
        var result = solution.isCircularSentence(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String sentence = "Leetcode is cool";
        boolean expected = false;
        var result = solution.isCircularSentence(sentence);
        assertThat(result).isEqualTo(expected);
    }

}
