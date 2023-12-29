package com.blogspot.ostas.leetcode.all.hard.orderly_queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "cba", k = 1
    Output: "acb"
    Explanation:
    In the first move, we move the 1st character 'c' to the end, obtaining the string "bac".
    In the second move, we move the 1st character 'b' to the end, obtaining the final result "acb".
    Example 2:
    Input: s = "baaca", k = 3
    Output: "aaabc"
    Explanation:
    In the first move, we move the 1st character 'b' to the end, obtaining the string "aacab".
    In the second move, we move the 3rd character 'c' to the end, obtaining the final result "aaabc".
      Constraints:
    1 <= k <= s.length <= 1000
    s consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "cba";
        int k = 1;
        String expected = "acb";
        var result = solution.orderlyQueue(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "baaca";
        int k = 3;
        String expected = "aaabc";
        var result = solution.orderlyQueue(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
