package com.blogspot.ostas.leetcode.all.hard.scramble_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "great", s2 = "rgeat"
    Output: true
    Explanation: One possible scenario applied on s1 is:
    "great" --> "gr/eat" // divide at random index.
    "gr/eat" --> "gr/eat" // random decision is not to swap the two substrings and keep them in order.
    "gr/eat" --> "g/r / e/at" // apply the same algorithm recursively on both substrings. divide at random index each of them.
    "g/r / e/at" --> "r/g / e/at" // random decision was to swap the first substring and to keep the second substring in the same order.
    "r/g / e/at" --> "r/g / e/ a/t" // again apply the algorithm recursively, divide "at" to "a/t".
    "r/g / e/ a/t" --> "r/g / e/ a/t" // random decision is to keep both substrings in the same order.
    The algorithm stops now, and the result string is "rgeat" which is s2.
    As one possible scenario led s1 to be scrambled to s2, we return true.
    Example 2:
    Input: s1 = "abcde", s2 = "caebd"
    Output: false
    Example 3:
    Input: s1 = "a", s2 = "a"
    Output: true
      Constraints:
    s1.length == s2.length
    1 <= s1.length <= 30
    s1 and s2 consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "great";
        String s2 = "rgeat";
        boolean expected = true;
        var result = solution.isScramble(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "abcde";
        String s2 = "caebd";
        boolean expected = false;
        var result = solution.isScramble(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s1 = "a";
        String s2 = "a";
        boolean expected = true;
        var result = solution.isScramble(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
