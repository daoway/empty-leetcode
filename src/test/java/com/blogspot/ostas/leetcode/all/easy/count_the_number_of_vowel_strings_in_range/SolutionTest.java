package com.blogspot.ostas.leetcode.all.easy.count_the_number_of_vowel_strings_in_range;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["are","amy","u"], left = 0, right = 2
    Output: 2
    Explanation:
    - "are" is a vowel string because it starts with 'a' and ends with 'e'.
    - "amy" is not a vowel string because it does not end with a vowel.
    - "u" is a vowel string because it starts with 'u' and ends with 'u'.
    The number of vowel strings in the mentioned range is 2.
    Example 2:
    Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
    Output: 3
    Explanation:
    - "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
    - "mu" is not a vowel string because it does not start with a vowel.
    - "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
    - "artro" is a vowel string because it starts with 'a' and ends with 'o'.
    The number of vowel strings in the mentioned range is 3.
      Constraints:
    1 <= words.length <= 1000
    1 <= words[i].length <= 10
    words[i] consists of only lowercase English letters.
    0 <= left <= right < words.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"are", "amy", "u"};
        int left = 0;
        int right = 2;
        int expected = 2;
        var result = solution.vowelStrings(words, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"hey", "aeo", "mu", "ooo", "artro"};
        int left = 1;
        int right = 4;
        int expected = 3;
        var result = solution.vowelStrings(words, left, right);
        assertThat(result).isEqualTo(expected);
    }

}
