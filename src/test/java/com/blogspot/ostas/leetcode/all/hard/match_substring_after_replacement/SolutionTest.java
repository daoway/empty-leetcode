package com.blogspot.ostas.leetcode.all.hard.match_substring_after_replacement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "fool3e7bar", sub = "leet", mappings = [["e","3"],["t","7"],["t","8"]]
    Output: true
    Explanation: Replace the first 'e' in sub with '3' and 't' in sub with '7'.
    Now sub = "l3e7" is a substring of s, so we return true.
    Example 2:
    Input: s = "fooleetbar", sub = "f00l", mappings = [["o","0"]]
    Output: false
    Explanation: The string "f00l" is not a substring of s and no replacements can be made.
    Note that we cannot replace '0' with 'o'.
    Example 3:
    Input: s = "Fool33tbaR", sub = "leetd", mappings = [["e","3"],["t","7"],["t","8"],["d","b"],["p","b"]]
    Output: true
    Explanation: Replace the first and second 'e' in sub with '3' and 'd' in sub with 'b'.
    Now sub = "l33tb" is a substring of s, so we return true.
      Constraints:
    1 <= sub.length <= s.length <= 5000
    0 <= mappings.length <= 1000
    mappings[i].length == 2
    oldi != newi
    s and sub consist of uppercase and lowercase English letters and digits.
    oldi and newi are either uppercase or lowercase English letters or digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "fool3e7bar";
        String sub = "leet";
        char[][] mappings = new char[][]{{'e', '3'}, {'t', '7'}, {'t', '8'}};
        boolean expected = true;
        var result = solution.matchReplacement(s, sub, mappings);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "fooleetbar";
        String sub = "f00l";
        char[][] mappings = new char[][]{{'o', '0'}};
        boolean expected = false;
        var result = solution.matchReplacement(s, sub, mappings);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "Fool33tbaR";
        String sub = "leetd";
        char[][] mappings = new char[][]{{'e', '3'}, {'t', '7'}, {'t', '8'}, {'d', 'b'}, {'p', 'b'}};
        boolean expected = true;
        var result = solution.matchReplacement(s, sub, mappings);
        assertThat(result).isEqualTo(expected);
    }

}
