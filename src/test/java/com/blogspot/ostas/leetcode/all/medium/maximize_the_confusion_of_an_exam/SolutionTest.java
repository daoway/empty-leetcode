package com.blogspot.ostas.leetcode.all.medium.maximize_the_confusion_of_an_exam;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: answerKey = "TTFF", k = 2
    Output: 4
    Explanation: We can replace both the 'F's with 'T's to make answerKey = "TTTT".
    There are four consecutive 'T's.
    Example 2:
    Input: answerKey = "TFFT", k = 1
    Output: 3
    Explanation: We can replace the first 'T' with an 'F' to make answerKey = "FFFT".
    Alternatively, we can replace the second 'T' with an 'F' to make answerKey = "TFFF".
    In both cases, there are three consecutive 'F's.
    Example 3:
    Input: answerKey = "TTFTTFTT", k = 1
    Output: 5
    Explanation: We can replace the first 'F' to make answerKey = "TTTTTFTT"
    Alternatively, we can replace the second 'F' to make answerKey = "TTFTTTTT".
    In both cases, there are five consecutive 'T's.
      Constraints:
    n == answerKey.length
    1 <= n <= 5 * 104
    answerKey[i] is either 'T' or 'F'
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String answerKey = "TTFF";
        int k = 2;
        int expected = 4;
        var result = solution.maxConsecutiveAnswers(answerKey, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String answerKey = "TFFT";
        int k = 1;
        int expected = 3;
        var result = solution.maxConsecutiveAnswers(answerKey, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String answerKey = "TTFTTFTT";
        int k = 1;
        int expected = 5;
        var result = solution.maxConsecutiveAnswers(answerKey, k);
        assertThat(result).isEqualTo(expected);
    }

}
