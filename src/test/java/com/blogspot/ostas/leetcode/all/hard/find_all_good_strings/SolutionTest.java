package com.blogspot.ostas.leetcode.all.hard.find_all_good_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, s1 = "aa", s2 = "da", evil = "b"
    Output: 51
    Explanation: There are 25 good strings starting with 'a': "aa","ac","ad",...,"az". Then there are 25 good strings starting with 'c': "ca","cc","cd",...,"cz" and finally there is one good string starting with 'd': "da".
    Example 2:
    Input: n = 8, s1 = "leetcode", s2 = "leetgoes", evil = "leet"
    Output: 0
    Explanation: All strings greater than or equal to s1 and smaller than or equal to s2 start with the prefix "leet", therefore, there is not any good string.
    Example 3:
    Input: n = 2, s1 = "gx", s2 = "gz", evil = "x"
    Output: 2
      Constraints:
    s1.length == n
    s2.length == n
    s1 <= s2
    1 <= n <= 500
    1 <= evil.length <= 50
    All strings consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        String s1 = "aa";
        String s2 = "da";
        String evil = "b";
        int expected = 51;
        var result = solution.findGoodStrings(n, s1, s2, evil);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 8;
        String s1 = "leetcode";
        String s2 = "leetgoes";
        String evil = "leet";
        int expected = 0;
        var result = solution.findGoodStrings(n, s1, s2, evil);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        String s1 = "gx";
        String s2 = "gz";
        String evil = "x";
        int expected = 2;
        var result = solution.findGoodStrings(n, s1, s2, evil);
        assertThat(result).isEqualTo(expected);
    }

}
