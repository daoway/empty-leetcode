package com.blogspot.ostas.leetcode.all.easy.increasing_decreasing_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aaaabbbbcccc"
    Output: "abccbaabccba"
    Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
    After steps 4, 5 and 6 of the first iteration, result = "abccba"
    First iteration is done. Now s = "aabbcc" and we go back to step 1
    After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
    After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
    Example 2:
    Input: s = "rat"
    Output: "art"
    Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.
      Constraints:
    1 <= s.length <= 500
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aaaabbbbcccc";
        String expected = "abccbaabccba";
        var result = solution.sortString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "rat";
        String expected = "art";
        var result = solution.sortString(s);
        assertThat(result).isEqualTo(expected);
    }

}
