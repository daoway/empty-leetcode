package com.blogspot.ostas.leetcode.all.hard.longest_chunked_palindrome_decomposition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "ghiabcdefhelloadamhelloabcdefghi"
    Output: 7
    Explanation: We can split the string on "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)".
    Example 2:
    Input: text = "merchant"
    Output: 1
    Explanation: We can split the string on "(merchant)".
    Example 3:
    Input: text = "antaprezatepzapreanta"
    Output: 11
    Explanation: We can split the string on "(a)(nt)(a)(pre)(za)(tep)(za)(pre)(a)(nt)(a)".
      Constraints:
    1 <= text.length <= 1000
    text consists only of lowercase English characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "ghiabcdefhelloadamhelloabcdefghi";
        int expected = 7;
        var result = solution.longestDecomposition(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "merchant";
        int expected = 1;
        var result = solution.longestDecomposition(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String text = "antaprezatepzapreanta";
        int expected = 11;
        var result = solution.longestDecomposition(text);
        assertThat(result).isEqualTo(expected);
    }

}
