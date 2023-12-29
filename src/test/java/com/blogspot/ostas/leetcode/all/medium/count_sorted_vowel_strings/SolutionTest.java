package com.blogspot.ostas.leetcode.all.medium.count_sorted_vowel_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 5
    Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].
    Example 2:
    Input: n = 2
    Output: 15
    Explanation: The 15 sorted strings that consist of vowels only are
    ["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
    Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.
    Example 3:
    Input: n = 33
    Output: 66045
      Constraints:
    1 <= n <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int expected = 5;
        var result = solution.countVowelStrings(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 15;
        var result = solution.countVowelStrings(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 33;
        int expected = 66045;
        var result = solution.countVowelStrings(n);
        assertThat(result).isEqualTo(expected);
    }

}
