package com.blogspot.ostas.leetcode.all.medium.shortest_and_lexicographically_smallest_beautiful_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "100011001", k = 3
    Output: "11001"
    Explanation: There are 7 beautiful substrings in this example:
    1. The substring "100011001".
    2. The substring "100011001".
    3. The substring "100011001".
    4. The substring "100011001".
    5. The substring "100011001".
    6. The substring "100011001".
    7. The substring "100011001".
    The length of the shortest beautiful substring is 5.
    The lexicographically smallest beautiful substring with length 5 is the substring "11001".
    Example 2:
    Input: s = "1011", k = 2
    Output: "11"
    Explanation: There are 3 beautiful substrings in this example:
    1. The substring "1011".
    2. The substring "1011".
    3. The substring "1011".
    The length of the shortest beautiful substring is 2.
    The lexicographically smallest beautiful substring with length 2 is the substring "11".
    Example 3:
    Input: s = "000", k = 1
    Output: ""
    Explanation: There are no beautiful substrings in this example.
      Constraints:
    1 <= s.length <= 100
    1 <= k <= s.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "100011001";
        int k = 3;
        String expected = "11001";
        var result = solution.shortestBeautifulSubstring(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "1011";
        int k = 2;
        String expected = "11";
        var result = solution.shortestBeautifulSubstring(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "000";
        int k = 1;
        String expected = "";
        var result = solution.shortestBeautifulSubstring(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
