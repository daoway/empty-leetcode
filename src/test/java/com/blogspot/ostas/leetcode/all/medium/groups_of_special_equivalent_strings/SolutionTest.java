package com.blogspot.ostas.leetcode.all.medium.groups_of_special_equivalent_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
    Output: 3
    Explanation:
    One group is ["abcd", "cdab", "cbad"], since they are all pairwise special equivalent, and none of the other strings is all pairwise special equivalent to these.
    The other two groups are ["xyzz", "zzxy"] and ["zzyx"].
    Note that in particular, "zzxy" is not special equivalent to "zzyx".
    Example 2:
    Input: words = ["abc","acb","bac","bca","cab","cba"]
    Output: 3
      Constraints:
    1 <= words.length <= 1000
    1 <= words[i].length <= 20
    words[i] consist of lowercase English letters.
    All the strings are of the same length.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        int expected = 3;
        var result = solution.numSpecialEquivGroups(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"abc", "acb", "bac", "bca", "cab", "cba"};
        int expected = 3;
        var result = solution.numSpecialEquivGroups(words);
        assertThat(result).isEqualTo(expected);
    }

}
