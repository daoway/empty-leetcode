package com.blogspot.ostas.leetcode.all.medium.count_number_of_texts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pressedKeys = "22233"
    Output: 8
    Explanation:
    The possible text messages Alice could have sent are:
    "aaadd", "abdd", "badd", "cdd", "aaae", "abe", "bae", and "ce".
    Since there are 8 possible messages, we return 8.
    Example 2:
    Input: pressedKeys = "222222222222222222222222222222222222"
    Output: 82876089
    Explanation:
    There are 2082876103 possible text messages Alice could have sent.
    Since we need to return the answer modulo 109 + 7, we return 2082876103 % (109 + 7) = 82876089.
      Constraints:
    1 <= pressedKeys.length <= 105
    pressedKeys only consists of digits from '2' - '9'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String pressedKeys = "22233";
        int expected = 8;
        var result = solution.countTexts(pressedKeys);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String pressedKeys = "222222222222222222222222222222222222";
        int expected = 82876089;
        var result = solution.countTexts(pressedKeys);
        assertThat(result).isEqualTo(expected);
    }

}
