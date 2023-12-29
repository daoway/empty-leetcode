package com.blogspot.ostas.leetcode.all.hard.palindrome_partitioning_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abc", k = 2
    Output: 1
    Explanation: You can split the string into "ab" and "c", and change 1 character in "ab" to make it palindrome.
    Example 2:
    Input: s = "aabbc", k = 3
    Output: 0
    Explanation: You can split the string into "aa", "bb" and "c", all of them are palindrome.
    Example 3:
    Input: s = "leetcode", k = 8
    Output: 0
      Constraints:
    1 <= k <= s.length <= 100.
    s only contains lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abc";
        int k = 2;
        int expected = 1;
        var result = solution.palindromePartition(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aabbc";
        int k = 3;
        int expected = 0;
        var result = solution.palindromePartition(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "leetcode";
        int k = 8;
        int expected = 0;
        var result = solution.palindromePartition(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
