package com.blogspot.ostas.leetcode.all.hard.count_beautiful_substrings_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "baeyh", k = 2
    Output: 2
    Explanation: There are 2 beautiful substrings in the given string.
    - Substring "baeyh", vowels = 2 (["a",e"]), consonants = 2 (["y","h"]).
    You can see that string "aeyh" is beautiful as vowels == consonants and vowels * consonants % k == 0.
    - Substring "baeyh", vowels = 2 (["a",e"]), consonants = 2 (["b","y"]).
    You can see that string "baey" is beautiful as vowels == consonants and vowels * consonants % k == 0.
    It can be shown that there are only 2 beautiful substrings in the given string.
    Example 2:
    Input: s = "abba", k = 1
    Output: 3
    Explanation: There are 3 beautiful substrings in the given string.
    - Substring "abba", vowels = 1 (["a"]), consonants = 1 (["b"]).
    - Substring "abba", vowels = 1 (["a"]), consonants = 1 (["b"]).
    - Substring "abba", vowels = 2 (["a","a"]), consonants = 2 (["b","b"]).
    It can be shown that there are only 3 beautiful substrings in the given string.
    Example 3:
    Input: s = "bcdf", k = 1
    Output: 0
    Explanation: There are no beautiful substrings in the given string.
      Constraints:
    1 <= s.length <= 5 * 104
    1 <= k <= 1000
    s consists of only English lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "baeyh";
        int k = 2;
        long expected = 2;
        var result = solution.beautifulSubstrings(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abba";
        int k = 1;
        long expected = 3;
        var result = solution.beautifulSubstrings(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "bcdf";
        int k = 1;
        long expected = 0;
        var result = solution.beautifulSubstrings(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
