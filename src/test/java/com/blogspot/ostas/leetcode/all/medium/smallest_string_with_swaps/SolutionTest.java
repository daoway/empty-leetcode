package com.blogspot.ostas.leetcode.all.medium.smallest_string_with_swaps;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "dcab", pairs = [[0,3],[1,2]]
    Output: "bacd"
    Explaination:
    Swap s[0] and s[3], s = "bcad"
    Swap s[1] and s[2], s = "bacd"
    Example 2:
    Input: s = "dcab", pairs = [[0,3],[1,2],[0,2]]
    Output: "abcd"
    Explaination:
    Swap s[0] and s[3], s = "bcad"
    Swap s[0] and s[2], s = "acbd"
    Swap s[1] and s[2], s = "abcd"
    Example 3:
    Input: s = "cba", pairs = [[0,1],[1,2]]
    Output: "abc"
    Explaination:
    Swap s[0] and s[1], s = "bca"
    Swap s[1] and s[2], s = "bac"
    Swap s[0] and s[1], s = "abc"
      Constraints:
    1 <= s.length <= 10^5
    0 <= pairs.length <= 10^5
    0 <= pairs[i][0], pairs[i][1] < s.length
    s only contains lower case English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "dcab";
        List<List<Integer>> pairs = List.of(List.of(0, 3), List.of(1, 2));
        String expected = "bacd";
        var result = solution.smallestStringWithSwaps(s, pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "dcab";
        List<List<Integer>> pairs = List.of(List.of(0, 3), List.of(1, 2), List.of(0, 2));
        String expected = "abcd";
        var result = solution.smallestStringWithSwaps(s, pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "cba";
        List<List<Integer>> pairs = List.of(List.of(0, 1), List.of(1, 2));
        String expected = "abc";
        var result = solution.smallestStringWithSwaps(s, pairs);
        assertThat(result).isEqualTo(expected);
    }

}
