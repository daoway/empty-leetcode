package com.blogspot.ostas.leetcode.all.medium.longest_uncommon_subsequence_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["aba","cdc","eae"]
    Output: 3
    Example 2:
    Input: strs = ["aaa","aaa","aa"]
    Output: -1
      Constraints:
    2 <= strs.length <= 50
    1 <= strs[i].length <= 10
    strs[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"aba", "cdc", "eae"};
        int expected = 3;
        var result = solution.findLUSlength(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{"aaa", "aaa", "aa"};
        int expected = -1;
        var result = solution.findLUSlength(strs);
        assertThat(result).isEqualTo(expected);
    }

}
