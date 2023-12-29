package com.blogspot.ostas.leetcode.all.hard.valid_permutations_for_di_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "DID"
    Output: 5
    Explanation: The 5 valid permutations of (0, 1, 2, 3) are:
    (1, 0, 3, 2)
    (2, 0, 3, 1)
    (2, 1, 3, 0)
    (3, 0, 2, 1)
    (3, 1, 2, 0)
    Example 2:
    Input: s = "D"
    Output: 1
      Constraints:
    n == s.length
    1 <= n <= 200
    s[i] is either 'I' or 'D'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "DID";
        int expected = 5;
        var result = solution.numPermsDISequence(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "D";
        int expected = 1;
        var result = solution.numPermsDISequence(s);
        assertThat(result).isEqualTo(expected);
    }

}
