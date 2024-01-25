package com.blogspot.ostas.leetcode.all.medium.lexicographically_smallest_equivalent_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "parker", s2 = "morris", baseStr = "parser"
    Output: "makkek"
    Explanation: Based on the equivalency information in s1 and s2, we can group their characters as [m,p], [a,o], [k,r,s], [e,i].
    The characters in each group are equivalent and sorted in lexicographical order.
    So the answer is "makkek".
    Example 2:
    Input: s1 = "hello", s2 = "world", baseStr = "hold"
    Output: "hdld"
    Explanation: Based on the equivalency information in s1 and s2, we can group their characters as [h,w], [d,e,o], [l,r].
    So only the second letter 'o' in baseStr is changed to 'd', the answer is "hdld".
    Example 3:
    Input: s1 = "leetcode", s2 = "programs", baseStr = "sourcecode"
    Output: "aauaaaaada"
    Explanation: We group the equivalent characters in s1 and s2 as [a,o,e,r,s,c], [l,p], [g,t] and [d,m], thus all letters in baseStr except 'u' and 'd' are transformed to 'a', the answer is "aauaaaaada".
      Constraints:
    1 <= s1.length, s2.length, baseStr <= 1000
    s1.length == s2.length
    s1, s2, and baseStr consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";
        String expected = "makkek";
        var result = solution.smallestEquivalentString(s1, s2, baseStr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "hello";
        String s2 = "world";
        String baseStr = "hold";
        String expected = "hdld";
        var result = solution.smallestEquivalentString(s1, s2, baseStr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s1 = "leetcode";
        String s2 = "programs";
        String baseStr = "sourcecode";
        String expected = "aauaaaaada";
        var result = solution.smallestEquivalentString(s1, s2, baseStr);
        assertThat(result).isEqualTo(expected);
    }

}
