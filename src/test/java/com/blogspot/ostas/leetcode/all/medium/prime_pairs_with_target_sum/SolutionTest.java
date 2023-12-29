package com.blogspot.ostas.leetcode.all.medium.prime_pairs_with_target_sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10
    Output: [[3,7],[5,5]]
    Explanation: In this example, there are two prime pairs that satisfy the criteria.
    These pairs are [3,7] and [5,5], and we return them in the sorted order as described in the problem statement.
    Example 2:
    Input: n = 2
    Output: []
    Explanation: We can show that there is no prime number pair that gives a sum of 2, so we return an empty array.
      Constraints:
    1 <= n <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 10;
        List<List<Integer>> expected = List.of(List.of(3, 7), List.of(5, 5));
        var result = solution.findPrimePairs(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        List<List<Integer>> expected = List.of();
        var result = solution.findPrimePairs(n);
        assertThat(result).isEqualTo(expected);
    }

}
