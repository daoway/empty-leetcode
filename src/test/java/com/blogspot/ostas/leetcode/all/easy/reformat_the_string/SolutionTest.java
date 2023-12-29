package com.blogspot.ostas.leetcode.all.easy.reformat_the_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "a0b1c2"
    Output: "0a1b2c"
    Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.
    Example 2:
    Input: s = "leetcode"
    Output: ""
    Explanation: "leetcode" has only characters so we cannot separate them by digits.
    Example 3:
    Input: s = "1229857369"
    Output: ""
    Explanation: "1229857369" has only digits so we cannot separate them by characters.
      Constraints:
    1 <= s.length <= 500
    s consists of only lowercase English letters and/or digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "a0b1c2";
        var result = solution.reformat(s);
        assertThat(result).isIn("0a1b2c", "a0b1c2", "0a1b2c", "0c2a1b");
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcode";
        String expected = "";
        var result = solution.reformat(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1229857369";
        String expected = "";
        var result = solution.reformat(s);
        assertThat(result).isEqualTo(expected);
    }

}
