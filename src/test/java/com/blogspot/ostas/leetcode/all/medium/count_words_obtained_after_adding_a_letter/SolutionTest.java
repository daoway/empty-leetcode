package com.blogspot.ostas.leetcode.all.medium.count_words_obtained_after_adding_a_letter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startWords = ["ant","act","tack"], targetWords = ["tack","act","acti"]
    Output: 2
    Explanation:
    - In order to form targetWords[0] = "tack", we use startWords[1] = "act", append 'k' to it, and rearrange "actk" to "tack".
    - There is no string in startWords that can be used to obtain targetWords[1] = "act".
      Note that "act" does exist in startWords, but we must append one letter to the string before rearranging it.
    - In order to form targetWords[2] = "acti", we use startWords[1] = "act", append 'i' to it, and rearrange "acti" to "acti" itself.
    Example 2:
    Input: startWords = ["ab","a"], targetWords = ["abc","abcd"]
    Output: 1
    Explanation:
    - In order to form targetWords[0] = "abc", we use startWords[0] = "ab", add 'c' to it, and rearrange it to "abc".
    - There is no string in startWords that can be used to obtain targetWords[1] = "abcd".
      Constraints:
    1 <= startWords.length, targetWords.length <= 5 * 104
    1 <= startWords[i].length, targetWords[j].length <= 26
    Each string of startWords and targetWords consists of lowercase English letters only.
    No letter occurs more than once in any string of startWords or targetWords.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] startWords = new String[]{"ant", "act", "tack"};
        String[] targetWords = new String[]{"tack", "act", "acti"};
        int expected = 2;
        var result = solution.wordCount(startWords, targetWords);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] startWords = new String[]{"ab", "a"};
        String[] targetWords = new String[]{"abc", "abcd"};
        int expected = 1;
        var result = solution.wordCount(startWords, targetWords);
        assertThat(result).isEqualTo(expected);
    }

}
