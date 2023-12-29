package com.blogspot.ostas.leetcode.all.medium.longest_unequal_adjacent_groups_subsequence_i;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, words = ["e","a","b"], groups = [0,0,1]
    Output: ["e","b"]
    Explanation: A subsequence that can be selected is [0,2] because groups[0] != groups[2].
    So, a valid answer is [words[0],words[2]] = ["e","b"].
    Another subsequence that can be selected is [1,2] because groups[1] != groups[2].
    This results in [words[1],words[2]] = ["a","b"].
    It is also a valid answer.
    It can be shown that the length of the longest subsequence of indices that satisfies the condition is 2.
    Example 2:
    Input: n = 4, words = ["a","b","c","d"], groups = [1,0,1,1]
    Output: ["a","b","c"]
    Explanation: A subsequence that can be selected is [0,1,2] because groups[0] != groups[1] and groups[1] != groups[2].
    So, a valid answer is [words[0],words[1],words[2]] = ["a","b","c"].
    Another subsequence that can be selected is [0,1,3] because groups[0] != groups[1] and groups[1] != groups[3].
    This results in [words[0],words[1],words[3]] = ["a","b","d"].
    It is also a valid answer.
    It can be shown that the length of the longest subsequence of indices that satisfies the condition is 3.
      Constraints:
    1 <= n == words.length == groups.length <= 100
    1 <= words[i].length <= 10
    0 <= groups[i] < 2
    words consists of distinct strings.
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        String[] words = new String[]{"e", "a", "b"};
        int[] groups = new int[]{0, 0, 1};
        List<String> expected = List.of("e", "b");
        var result = solution.getWordsInLongestSubsequence(n, words, groups);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        String[] words = new String[]{"a", "b", "c", "d"};
        int[] groups = new int[]{1, 0, 1, 1};
        List<String> expected = List.of("a", "b", "c");
        var result = solution.getWordsInLongestSubsequence(n, words, groups);
        assertThat(result).isEqualTo(expected);
    }

}
