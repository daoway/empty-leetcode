package com.blogspot.ostas.leetcode.all.hard.number_of_distinct_roll_sequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: 184
    Explanation: Some of the possible sequences are (1, 2, 3, 4), (6, 1, 2, 3), (1, 2, 3, 1), etc.
    Some invalid sequences are (1, 2, 1, 3), (1, 2, 3, 6).
    (1, 2, 1, 3) is invalid since the first and third roll have an equal value and abs(1 - 3) = 2 (i and j are 1-indexed).
    (1, 2, 3, 6) is invalid since the greatest common divisor of 3 and 6 = 3.
    There are a total of 184 distinct sequences possible, so we return 184.
    Example 2:
    Input: n = 2
    Output: 22
    Explanation: Some of the possible sequences are (1, 2), (2, 1), (3, 2).
    Some invalid sequences are (3, 6), (2, 4) since the greatest common divisor is not equal to 1.
    There are a total of 22 distinct sequences possible, so we return 22.
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int expected = 184;
        var result = solution.distinctSequences(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 22;
        var result = solution.distinctSequences(n);
        assertThat(result).isEqualTo(expected);
    }

}
