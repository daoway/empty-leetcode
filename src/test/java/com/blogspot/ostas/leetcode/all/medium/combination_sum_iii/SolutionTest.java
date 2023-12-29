package com.blogspot.ostas.leetcode.all.medium.combination_sum_iii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 3, n = 7
    Output: [[1,2,4]]
    Explanation:
    1 + 2 + 4 = 7
    There are no other valid combinations.
    Example 2:
    Input: k = 3, n = 9
    Output: [[1,2,6],[1,3,5],[2,3,4]]
    Explanation:
    1 + 2 + 6 = 9
    1 + 3 + 5 = 9
    2 + 3 + 4 = 9
    There are no other valid combinations.
    Example 3:
    Input: k = 4, n = 1
    Output: []
    Explanation: There are no valid combinations.
    Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
      Constraints:
    2 <= k <= 9
    1 <= n <= 60
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 3;
        int n = 7;
        List<List<Integer>> expected = List.of(List.of(1, 2, 4));
        var result = solution.combinationSum3(k, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 3;
        int n = 9;
        List<List<Integer>> expected = List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4));
        var result = solution.combinationSum3(k, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int k = 4;
        int n = 1;
        List<List<Integer>> expected = List.of();
        var result = solution.combinationSum3(k, n);
        assertThat(result).isEqualTo(expected);
    }

}
