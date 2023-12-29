package com.blogspot.ostas.leetcode.all.hard.verbal_arithmetic_puzzle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["SEND","MORE"], result = "MONEY"
    Output: true
    Explanation: Map 'S'-> 9, 'E'->5, 'N'->6, 'D'->7, 'M'->1, 'O'->0, 'R'->8, 'Y'->'2'
    Such that: "SEND" + "MORE" = "MONEY" ,  9567 + 1085 = 10652
    Example 2:
    Input: words = ["SIX","SEVEN","SEVEN"], result = "TWENTY"
    Output: true
    Explanation: Map 'S'-> 6, 'I'->5, 'X'->0, 'E'->8, 'V'->7, 'N'->2, 'T'->1, 'W'->'3', 'Y'->4
    Such that: "SIX" + "SEVEN" + "SEVEN" = "TWENTY" ,  650 + 68782 + 68782 = 138214
    Example 3:
    Input: words = ["LEET","CODE"], result = "POINT"
    Output: false
    Explanation: There is no possible mapping to satisfy the equation, so we return false.
    Note that two different characters cannot map to the same digit.
      Constraints:
    2 <= words.length <= 5
    1 <= words[i].length, result.length <= 7
    words[i], result contain only uppercase English letters.
    The number of different characters used in the expression is at most 10.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"SEND", "MORE"};
        String result = "MONEY";
        boolean expected = true;
        var output = solution.isSolvable(words, result);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"SIX", "SEVEN", "SEVEN"};
        String result = "TWENTY";
        boolean expected = true;
        var output = solution.isSolvable(words, result);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"LEET", "CODE"};
        String result = "POINT";
        boolean expected = false;
        var output = solution.isSolvable(words, result);
        assertThat(output).isEqualTo(expected);
    }

}
