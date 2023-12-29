package com.blogspot.ostas.leetcode.all.easy.longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
      Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        var result = solution.longestCommonPrefix(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{"dog", "racecar", "car"};
        String expected = "";
        var result = solution.longestCommonPrefix(strs);
        assertThat(result).isEqualTo(expected);
    }

}
