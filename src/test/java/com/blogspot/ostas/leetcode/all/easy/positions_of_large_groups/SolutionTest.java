package com.blogspot.ostas.leetcode.all.easy.positions_of_large_groups;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abbxxxxzzy"
    Output: [[3,6]]
    Explanation: "xxxx" is the only large group with start index 3 and end index 6.
    Example 2:
    Input: s = "abc"
    Output: []
    Explanation: We have groups "a", "b", and "c", none of which are large groups.
    Example 3:
    Input: s = "abcdddeeeeaabbbcd"
    Output: [[3,5],[6,9],[12,14]]
    Explanation: The large groups are "ddd", "eeee", and "bbb".
      Constraints:
    1 <= s.length <= 1000
    s contains lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abbxxxxzzy";
        List<List<Integer>> expected = List.of(List.of(3, 6));
        var result = solution.largeGroupPositions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abc";
        List<List<Integer>> expected = List.of();
        var result = solution.largeGroupPositions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "abcdddeeeeaabbbcd";
        List<List<Integer>> expected = List.of(List.of(3, 5), List.of(6, 9), List.of(12, 14));
        var result = solution.largeGroupPositions(s);
        assertThat(result).isEqualTo(expected);
    }

}
