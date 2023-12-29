package com.blogspot.ostas.leetcode.all.hard.string_transformation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcd", t = "cdab", k = 2
    Output: 2
    Explanation:
    First way:
    In first operation, choose suffix from index = 3, so resulting s = "dabc".
    In second operation, choose suffix from index = 3, so resulting s = "cdab".

    Second way:
    In first operation, choose suffix from index = 1, so resulting s = "bcda".
    In second operation, choose suffix from index = 1, so resulting s = "cdab".
    Example 2:
    Input: s = "ababab", t = "ababab", k = 1
    Output: 2
    Explanation:
    First way:
    Choose suffix from index = 2, so resulting s = "ababab".

    Second way:
    Choose suffix from index = 4, so resulting s = "ababab".
      Constraints:
    2 <= s.length <= 5 * 105
    1 <= k <= 1015
    s.length == t.length
    s and t consist of only lowercase English alphabets.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcd";
        String t = "cdab";
        long k = 2;
        int expected = 2;
        var result = solution.numberOfWays(s, t, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ababab";
        String t = "ababab";
        long k = 1;
        int expected = 2;
        var result = solution.numberOfWays(s, t, k);
        assertThat(result).isEqualTo(expected);
    }

}
