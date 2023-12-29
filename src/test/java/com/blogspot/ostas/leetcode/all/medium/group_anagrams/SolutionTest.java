package com.blogspot.ostas.leetcode.all.medium.group_anagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    Example 2:
    Input: strs = [""]
    Output: [[""]]
    Example 3:
    Input: strs = ["a"]
    Output: [["a"]]
      Constraints:
    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected =
                List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        var result = solution.groupAnagrams(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] strs = new String[]{""};
        List<List<String>> expected = List.of(List.of(""));
        var result = solution.groupAnagrams(strs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] strs = new String[]{"a"};
        List<List<String>> expected = List.of(List.of("a"));
        var result = solution.groupAnagrams(strs);
        assertThat(result).isEqualTo(expected);
    }

}
