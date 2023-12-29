package com.blogspot.ostas.leetcode.all.hard.count_k_subsequences_of_a_string_with_maximum_beauty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "bcca", k = 2
    Output: 4
    Explanation: From s we have f('a') = 1, f('b') = 1, and f('c') = 2.
    The k-subsequences of s are:
    bcca having a beauty of f('b') + f('c') = 3
    bcca having a beauty of f('b') + f('c') = 3
    bcca having a beauty of f('b') + f('a') = 2
    bcca having a beauty of f('c') + f('a') = 3
    bcca having a beauty of f('c') + f('a') = 3
    There are 4 k-subsequences that have the maximum beauty, 3.
    Hence, the answer is 4.
    Example 2:
    Input: s = "abbcd", k = 4
    Output: 2
    Explanation: From s we have f('a') = 1, f('b') = 2, f('c') = 1, and f('d') = 1.
    The k-subsequences of s are:
    abbcd having a beauty of f('a') + f('b') + f('c') + f('d') = 5
    abbcd having a beauty of f('a') + f('b') + f('c') + f('d') = 5
    There are 2 k-subsequences that have the maximum beauty, 5.
    Hence, the answer is 2.
      Constraints:
    1 <= s.length <= 2 * 105
    1 <= k <= s.length
    s consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "bcca";
        int k = 2;
        int expected = 4;
        var result = solution.countKSubsequencesWithMaxBeauty(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abbcd";
        int k = 4;
        int expected = 2;
        var result = solution.countKSubsequencesWithMaxBeauty(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
