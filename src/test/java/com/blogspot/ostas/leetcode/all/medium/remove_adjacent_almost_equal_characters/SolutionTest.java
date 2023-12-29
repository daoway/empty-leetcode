package com.blogspot.ostas.leetcode.all.medium.remove_adjacent_almost_equal_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "aaaaa"
    Output: 2
    Explanation: We can change word into "acaca" which does not have any adjacent almost-equal characters.
    It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.
    Example 2:
    Input: word = "abddez"
    Output: 2
    Explanation: We can change word into "ybdoez" which does not have any adjacent almost-equal characters.
    It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.
    Example 3:
    Input: word = "zyxyxyz"
    Output: 3
    Explanation: We can change word into "zaxaxaz" which does not have any adjacent almost-equal characters.
    It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 3.
      Constraints:
    1 <= word.length <= 100
    word consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "aaaaa";
        int expected = 2;
        var result = solution.removeAlmostEqualCharacters(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "abddez";
        int expected = 2;
        var result = solution.removeAlmostEqualCharacters(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "zyxyxyz";
        int expected = 3;
        var result = solution.removeAlmostEqualCharacters(word);
        assertThat(result).isEqualTo(expected);
    }

}
