package com.blogspot.ostas.leetcode.all.medium.interleaving_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
    Output: true
    Explanation: One way to obtain s3 is:
    Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
    Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
    Since s3 can be obtained by interleaving s1 and s2, we return true.
    Example 2:
    Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
    Output: false
    Explanation: Notice how it is impossible to interleave s2 with any other string to obtain s3.
    Example 3:
    Input: s1 = "", s2 = "", s3 = ""
    Output: true
      Constraints:
    0 <= s1.length, s2.length <= 100
    0 <= s3.length <= 200
    s1, s2, and s3 consist of lowercase English letters.
      Follow up: Could you solve it using only O(s2.length) additional memory space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean expected = true;
        var result = solution.isInterleave(s1, s2, s3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean expected = false;
        var result = solution.isInterleave(s1, s2, s3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        boolean expected = true;
        var result = solution.isInterleave(s1, s2, s3);
        assertThat(result).isEqualTo(expected);
    }

}
