package com.blogspot.ostas.leetcode.all.medium.optimal_partition_of_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abacaba"
    Output: 4
    Explanation:
    Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
    It can be shown that 4 is the minimum number of substrings needed.
    Example 2:
    Input: s = "ssssss"
    Output: 6
    Explanation:
    The only valid partition is ("s","s","s","s","s","s").
      Constraints:
    1 <= s.length <= 105
    s consists of only English lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abacaba";
        int expected = 4;
        var result = solution.partitionString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ssssss";
        int expected = 6;
        var result = solution.partitionString(s);
        assertThat(result).isEqualTo(expected);
    }

}
