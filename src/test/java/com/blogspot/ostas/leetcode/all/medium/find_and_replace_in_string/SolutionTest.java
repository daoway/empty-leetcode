package com.blogspot.ostas.leetcode.all.medium.find_and_replace_in_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcd", indices = [0, 2], sources = ["a", "cd"], targets = ["eee", "ffff"]
    Output: "eeebffff"
    Explanation:
    "a" occurs at index 0 in s, so we replace it with "eee".
    "cd" occurs at index 2 in s, so we replace it with "ffff".
    Example 2:
    Input: s = "abcd", indices = [0, 2], sources = ["ab","ec"], targets = ["eee","ffff"]
    Output: "eeecd"
    Explanation:
    "ab" occurs at index 0 in s, so we replace it with "eee".
    "ec" does not occur at index 2 in s, so we do nothing.
      Constraints:
    1 <= s.length <= 1000
    k == indices.length == sources.length == targets.length
    1 <= k <= 100
    0 <= indexes[i] < s.length
    1 <= sources[i].length, targets[i].length <= 50
    s consists of only lowercase English letters.
    sources[i] and targets[i] consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcd";
        int[] indices = new int[]{0, 2};
        String[] sources = new String[]{"a", "cd"};
        String[] targets = new String[]{"eee", "ffff"};
        String expected = "eeebffff";
        var result = solution.findReplaceString(s, indices, sources, targets);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        int[] indices = new int[]{0, 2};
        String[] sources = new String[]{"ab", "ec"};
        String[] targets = new String[]{"eee", "ffff"};
        String expected = "eeecd";
        var result = solution.findReplaceString(s, indices, sources, targets);
        assertThat(result).isEqualTo(expected);
    }


}
