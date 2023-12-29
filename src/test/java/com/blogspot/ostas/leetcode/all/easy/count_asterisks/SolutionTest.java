package com.blogspot.ostas.leetcode.all.easy.count_asterisks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "l|*e*et|c**o|*de|"
    Output: 2
    Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
    The characters between the first and second '|' are excluded from the answer.
    Also, the characters between the third and fourth '|' are excluded from the answer.
    There are 2 asterisks considered. Therefore, we return 2.
    Example 2:
    Input: s = "iamprogrammer"
    Output: 0
    Explanation: In this example, there are no asterisks in s. Therefore, we return 0.
    Example 3:
    Input: s = "yo|uar|e**|b|e***au|tifu|l"
    Output: 5
    Explanation: The considered characters are underlined: "yo|uar|e**|b|e***au|tifu|l". There are 5 asterisks considered. Therefore, we return 5.
      Constraints:
    1 <= s.length <= 1000
    s consists of lowercase English letters, vertical bars '|', and asterisks '*'.
    s contains an even number of vertical bars '|'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "l|*e*et|c**o|*de|";
        int expected = 2;
        var result = solution.countAsterisks(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "iamprogrammer";
        int expected = 0;
        var result = solution.countAsterisks(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "yo|uar|e**|b|e***au|tifu|l";
        int expected = 5;
        var result = solution.countAsterisks(s);
        assertThat(result).isEqualTo(expected);
    }

}
