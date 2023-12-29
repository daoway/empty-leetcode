package com.blogspot.ostas.leetcode.all.medium.shifting_letters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abc", shifts = [3,5,9]
    Output: "rpl"
    Explanation: We start with "abc".
    After shifting the first 1 letters of s by 3, we have "dbc".
    After shifting the first 2 letters of s by 5, we have "igc".
    After shifting the first 3 letters of s by 9, we have "rpl", the answer.
    Example 2:
    Input: s = "aaa", shifts = [1,2,3]
    Output: "gfd"
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    shifts.length == s.length
    0 <= shifts[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abc";
        int[] shifts = new int[]{3, 5, 9};
        String expected = "rpl";
        var result = solution.shiftingLetters(s, shifts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaa";
        int[] shifts = new int[]{1, 2, 3};
        String expected = "gfd";
        var result = solution.shiftingLetters(s, shifts);
        assertThat(result).isEqualTo(expected);
    }

}
