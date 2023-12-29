package com.blogspot.ostas.leetcode.all.medium.construct_the_lexicographically_largest_valid_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: [3,1,2,3,2]
    Explanation: [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.
    Example 2:
    Input: n = 5
    Output: [5,3,1,4,3,5,2,4,2]
      Constraints:
    1 <= n <= 20
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[] expected = new int[]{3, 1, 2, 3, 2};
        var result = solution.constructDistancedSequence(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[] expected = new int[]{5, 3, 1, 4, 3, 5, 2, 4, 2};
        var result = solution.constructDistancedSequence(n);
        assertThat(result).isEqualTo(expected);
    }

}
