package com.blogspot.ostas.leetcode.all.medium.partition_labels;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ababcbacadefegdehijhklij"
    Output: [9,7,8]
    Explanation:
    The partition is "ababcbaca", "defegde", "hijhklij".
    This is a partition so that each letter appears in at most one part.
    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
    Example 2:
    Input: s = "eccbbbbdec"
    Output: [10]
      Constraints:
    1 <= s.length <= 500
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
        List<Integer> expected = List.of(9, 7, 8);
        var result = solution.partitionLabels(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "eccbbbbdec";
        List<Integer> expected = List.of(10);
        var result = solution.partitionLabels(s);
        assertThat(result).isEqualTo(expected);
    }

}
