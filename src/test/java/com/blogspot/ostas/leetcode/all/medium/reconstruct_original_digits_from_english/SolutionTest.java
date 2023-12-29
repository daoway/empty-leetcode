package com.blogspot.ostas.leetcode.all.medium.reconstruct_original_digits_from_english;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "owoztneoer"
    Output: "012"
    Example 2:
    Input: s = "fviefuro"
    Output: "45"
      Constraints:
    1 <= s.length <= 105
    s[i] is one of the characters ["e","g","f","i","h","o","n","s","r","u","t","w","v","x","z"].
    s is guaranteed to be valid.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "owoztneoer";
        String expected = "012";
        var result = solution.originalDigits(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "fviefuro";
        String expected = "45";
        var result = solution.originalDigits(s);
        assertThat(result).isEqualTo(expected);
    }

}
