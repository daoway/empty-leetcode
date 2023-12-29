package com.blogspot.ostas.leetcode.all.medium.letter_case_permutation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "a1b2"
    Output: ["a1b2","a1B2","A1b2","A1B2"]
    Example 2:
    Input: s = "3z4"
    Output: ["3z4","3Z4"]
      Constraints:
    1 <= s.length <= 12
    s consists of lowercase English letters, uppercase English letters, and digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "a1b2";
        List<String> expected = List.of("a1b2", "a1B2", "A1b2", "A1B2");
        var result = solution.letterCasePermutation(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "3z4";
        List<String> expected = List.of("3z4", "3Z4");
        var result = solution.letterCasePermutation(s);
        assertThat(result).isEqualTo(expected);
    }

}
