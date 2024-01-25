package com.blogspot.ostas.leetcode.all.medium.vowels_of_all_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "aba"
    Output: 6
    Explanation:
    All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
    - "b" has 0 vowels in it
    - "a", "ab", "ba", and "a" have 1 vowel each
    - "aba" has 2 vowels in it
    Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6.
    Example 2:
    Input: word = "abc"
    Output: 3
    Explanation:
    All possible substrings are: "a", "ab", "abc", "b", "bc", and "c".
    - "a", "ab", and "abc" have 1 vowel each
    - "b", "bc", and "c" have 0 vowels each
    Hence, the total sum of vowels = 1 + 1 + 1 + 0 + 0 + 0 = 3.
    Example 3:
    Input: word = "ltcd"
    Output: 0
    Explanation: There are no vowels in any substring of "ltcd".
      Constraints:
    1 <= word.length <= 105
    word consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "aba";
        long expected = 6;
        var result = solution.countVowels(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "abc";
        long expected = 3;
        var result = solution.countVowels(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "ltcd";
        long expected = 0;
        var result = solution.countVowels(word);
        assertThat(result).isEqualTo(expected);
    }

}
