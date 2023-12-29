package com.blogspot.ostas.leetcode.all.medium.circular_permutation_in_binary_representation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, start = 3
    Output: [3,2,0,1]
    Explanation: The binary representation of the permutation is (11,10,00,01).
    All the adjacent element differ by one bit. Another valid permutation is [3,1,0,2]
    Example 2:
    Input: n = 3, start = 2
    Output: [2,6,7,5,4,0,1,3]
    Explanation: The binary representation of the permutation is (010,110,111,101,100,000,001,011).
      Constraints:
    1 <= n <= 16
    0 <= start < 2 ^ n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int start = 3;
        List<Integer> expected = List.of(3, 2, 0, 1);
        var result = solution.circularPermutation(n, start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int start = 2;
        List<Integer> expected = List.of(2, 6, 7, 5, 4, 0, 1, 3);
        var result = solution.circularPermutation(n, start);
        assertThat(result).isEqualTo(expected);
    }

}
