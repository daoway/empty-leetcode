package com.blogspot.ostas.leetcode.all.hard.similar_string_groups;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["tars","rats","arts","star"]
    Output: 2
    Example 2:
    Input: strs = ["omv","ovm"]
    Output: 1
      Constraints:
    1 <= strs.length <= 300
    1 <= strs[i].length <= 300
    strs[i] consists of lowercase letters only.
    All words in strs have the same length and are anagrams of each other.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"tars", "rats", "arts", "star"};
        int expected = 2;
        var result = solution.numSimilarGroups(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{"omv", "ovm"};
        int expected = 1;
        var result = solution.numSimilarGroups(strs);
        assertThat(result).isEqualTo(expected);
    }

}
