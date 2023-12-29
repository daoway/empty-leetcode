package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_removable_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcacb", p = "ab", removable = [3,1,0]
    Output: 2
    Explanation: After removing the characters at indices 3 and 1, "abcacb" becomes "accb".
    "ab" is a subsequence of "accb".
    If we remove the characters at indices 3, 1, and 0, "abcacb" becomes "ccb", and "ab" is no longer a subsequence.
    Hence, the maximum k is 2.
    Example 2:
    Input: s = "abcbddddd", p = "abcd", removable = [3,2,1,4,5,6]
    Output: 1
    Explanation: After removing the character at index 3, "abcbddddd" becomes "abcddddd".
    "abcd" is a subsequence of "abcddddd".
    Example 3:
    Input: s = "abcab", p = "abc", removable = [0,1,2,3,4]
    Output: 0
    Explanation: If you remove the first index in the array removable, "abc" is no longer a subsequence.
      Constraints:
    1 <= p.length <= s.length <= 105
    0 <= removable.length < s.length
    0 <= removable[i] < s.length
    p is a subsequence of s.
    s and p both consist of lowercase English letters.
    The elements in removable are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcacb";
        String p = "ab";
        int[] removable = new int[]{3, 1, 0};
        int expected = 2;
        var result = solution.maximumRemovals(s, p, removable);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcbddddd";
        String p = "abcd";
        int[] removable = new int[]{3, 2, 1, 4, 5, 6};
        int expected = 1;
        var result = solution.maximumRemovals(s, p, removable);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "abcab";
        String p = "abc";
        int[] removable = new int[]{0, 1, 2, 3, 4};
        int expected = 0;
        var result = solution.maximumRemovals(s, p, removable);
        assertThat(result).isEqualTo(expected);
    }

}
