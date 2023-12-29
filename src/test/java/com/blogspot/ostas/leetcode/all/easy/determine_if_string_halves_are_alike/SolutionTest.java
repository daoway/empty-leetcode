package com.blogspot.ostas.leetcode.all.easy.determine_if_string_halves_are_alike;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "book"
    Output: true
    Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
    Example 2:
    Input: s = "textbook"
    Output: false
    Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
    Notice that the vowel o is counted twice.
      Constraints:
    2 <= s.length <= 1000
    s.length is even.
    s consists of uppercase and lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "book";
        boolean expected = true;
        var result = solution.halvesAreAlike(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "textbook";
        boolean expected = false;
        var result = solution.halvesAreAlike(s);
        assertThat(result).isEqualTo(expected);
    }

}
