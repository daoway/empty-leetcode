package com.blogspot.ostas.leetcode.all.easy.reverse_only_letters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ab-cd"
    Output: "dc-ba"
    Example 2:
    Input: s = "a-bC-dEf-ghIj"
    Output: "j-Ih-gfE-dCba"
    Example 3:
    Input: s = "Test1ng-Leet=code-Q!"
    Output: "Qedo1ct-eeLg=ntse-T!"
      Constraints:
    1 <= s.length <= 100
    s consists of characters with ASCII values in the range [33, 122].
    s does not contain '\"' or '\\'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ab-cd";
        String expected = "dc-ba";
        var result = solution.reverseOnlyLetters(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a-bC-dEf-ghIj";
        String expected = "j-Ih-gfE-dCba";
        var result = solution.reverseOnlyLetters(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "Test1ng-Leet=code-Q!";
        String expected = "Qedo1ct-eeLg=ntse-T!";
        var result = solution.reverseOnlyLetters(s);
        assertThat(result).isEqualTo(expected);
    }

}
