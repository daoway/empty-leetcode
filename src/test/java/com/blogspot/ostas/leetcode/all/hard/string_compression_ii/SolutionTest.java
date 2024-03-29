package com.blogspot.ostas.leetcode.all.hard.string_compression_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aaabcccd", k = 2
    Output: 4
    Explanation: Compressing s without deleting anything will give us "a3bc3d" of length 6. Deleting any of the characters 'a' or 'c' would at most decrease the length of the compressed string to 5, for instance delete 2 'a' then we will have s = "abcccd" which compressed is abc3d. Therefore, the optimal way is to delete 'b' and 'd', then the compressed version of s will be "a3c3" of length 4.
    Example 2:
    Input: s = "aabbaa", k = 2
    Output: 2
    Explanation: If we delete both 'b' characters, the resulting compressed string would be "a4" of length 2.
    Example 3:
    Input: s = "aaaaaaaaaaa", k = 0
    Output: 3
    Explanation: Since k is zero, we cannot delete anything. The compressed string is "a11" of length 3.
      Constraints:
    1 <= s.length <= 100
    0 <= k <= s.length
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aaabcccd";
        int k = 2;
        int expected = 4;
        var result = solution.getLengthOfOptimalCompression(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aabbaa";
        int k = 2;
        int expected = 2;
        var result = solution.getLengthOfOptimalCompression(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aaaaaaaaaaa";
        int k = 0;
        int expected = 3;
        var result = solution.getLengthOfOptimalCompression(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
