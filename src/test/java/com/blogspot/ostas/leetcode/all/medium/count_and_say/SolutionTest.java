package com.blogspot.ostas.leetcode.all.medium.count_and_say;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: "1"
    Explanation: This is the base case.
    Example 2:
    Input: n = 4
    Output: "1211"
    Explanation:
    countAndSay(1) = "1"
    countAndSay(2) = say "1" = one 1 = "11"
    countAndSay(3) = say "11" = two 1's = "21"
    countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
      Constraints:
    1 <= n <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        String expected = "1";
        var result = solution.countAndSay(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        String expected = "1211";
        var result = solution.countAndSay(n);
        assertThat(result).isEqualTo(expected);
    }

}
