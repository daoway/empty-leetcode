package com.blogspot.ostas.leetcode.all.medium.using_a_robot_to_print_the_lexicographically_smallest_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "zza"
    Output: "azz"
    Explanation: Let p denote the written string.
    Initially p="", s="zza", t="".
    Perform first operation three times p="", s="", t="zza".
    Perform second operation three times p="azz", s="", t="".
    Example 2:
    Input: s = "bac"
    Output: "abc"
    Explanation: Let p denote the written string.
    Perform first operation twice p="", s="c", t="ba".
    Perform second operation twice p="ab", s="c", t="".
    Perform first operation p="ab", s="", t="c".
    Perform second operation p="abc", s="", t="".
    Example 3:
    Input: s = "bdda"
    Output: "addb"
    Explanation: Let p denote the written string.
    Initially p="", s="bdda", t="".
    Perform first operation four times p="", s="", t="bdda".
    Perform second operation four times p="addb", s="", t="".
      Constraints:
    1 <= s.length <= 105
    s consists of only English lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "zza";
        String expected = "azz";
        var result = solution.robotWithString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "bac";
        String expected = "abc";
        var result = solution.robotWithString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "bdda";
        String expected = "addb";
        var result = solution.robotWithString(s);
        assertThat(result).isEqualTo(expected);
    }

}
