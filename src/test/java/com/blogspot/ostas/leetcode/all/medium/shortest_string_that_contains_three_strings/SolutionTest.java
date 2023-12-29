package com.blogspot.ostas.leetcode.all.medium.shortest_string_that_contains_three_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = "abc", b = "bca", c = "aaa"
    Output: "aaabca"
    Explanation:  We show that "aaabca" contains all the given strings: a = ans[2...4], b = ans[3..5], c = ans[0..2]. It can be shown that the length of the resulting string would be at least 6 and "aaabca" is the lexicographically smallest one.
    Example 2:
    Input: a = "ab", b = "ba", c = "aba"
    Output: "aba"
    Explanation: We show that the string "aba" contains all the given strings: a = ans[0..1], b = ans[1..2], c = ans[0..2]. Since the length of c is 3, the length of the resulting string would be at least 3. It can be shown that "aba" is the lexicographically smallest one.
      Constraints:
    1 <= a.length, b.length, c.length <= 100
    a, b, c consist only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String a = "abc";
        String b = "bca";
        String c = "aaa";
        String expected = "aaabca";
        var result = solution.minimumString(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String a = "ab";
        String b = "ba";
        String c = "aba";
        String expected = "aba";
        var result = solution.minimumString(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

}
