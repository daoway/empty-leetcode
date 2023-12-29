package com.blogspot.ostas.leetcode.all.hard.k_similar_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "ab", s2 = "ba"
    Output: 1
    Explanation: The two string are 1-similar because we can use one swap to change s1 to s2: "ab" --> "ba".
    Example 2:
    Input: s1 = "abc", s2 = "bca"
    Output: 2
    Explanation: The two strings are 2-similar because we can use two swaps to change s1 to s2: "abc" --> "bac" --> "bca".
      Constraints:
    1 <= s1.length <= 20
    s2.length == s1.length
    s1 and s2 contain only lowercase letters from the set {'a', 'b', 'c', 'd', 'e', 'f'}.
    s2 is an anagram of s1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "ab";
        String s2 = "ba";
        int expected = 1;
        var result = solution.kSimilarity(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "abc";
        String s2 = "bca";
        int expected = 2;
        var result = solution.kSimilarity(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
