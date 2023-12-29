package com.blogspot.ostas.leetcode.all.medium.longest_unequal_adjacent_groups_subsequence_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, words = ["bab","dab","cab"], groups = [1,2,2]
    Output: ["bab","cab"]
    Explanation: A subsequence that can be selected is [0,2].
    - groups[0] != groups[2]
    - words[0].length == words[2].length, and the hamming distance between them is 1.
    So, a valid answer is [words[0],words[2]] = ["bab","cab"].
    Another subsequence that can be selected is [0,1].
    - groups[0] != groups[1]
    - words[0].length == words[1].length, and the hamming distance between them is 1.
    So, another valid answer is [words[0],words[1]] = ["bab","dab"].
    It can be shown that the length of the longest subsequence of indices that satisfies the conditions is 2.
    Example 2:
    Input: n = 4, words = ["a","b","c","d"], groups = [1,2,3,4]
    Output: ["a","b","c","d"]
    Explanation: We can select the subsequence [0,1,2,3].
    It satisfies both conditions.
    Hence, the answer is [words[0],words[1],words[2],words[3]] = ["a","b","c","d"].
    It has the longest length among all subsequences of indices that satisfy the conditions.
    Hence, it is the only answer.
      Constraints:
    1 <= n == words.length == groups.length <= 1000
    1 <= words[i].length <= 10
    1 <= groups[i] <= n
    words consists of distinct strings.
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        String[] words = new String[]{"bab", "dab", "cab"};
        int[] groups = new int[]{1, 2, 2};
        List<String> expected1 = List.of("bab", "cab");
        List<String> expected2 = List.of("bab", "dab");
        var result = solution.getWordsInLongestSubsequence(n, words, groups);
        assertThat(result).isIn(expected1, expected2);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        String[] words = new String[]{"a", "b", "c", "d"};
        int[] groups = new int[]{1, 2, 3, 4};
        List<String> expected = List.of("a", "b", "c", "d");
        var result = solution.getWordsInLongestSubsequence(n, words, groups);
        assertThat(result).isEqualTo(expected);
    }

}
