package com.blogspot.ostas.leetcode.all.medium.combinations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, k = 2
    Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
    Explanation: There are 4 choose 2 = 6 total combinations.
    Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
    Example 2:
    Input: n = 1, k = 1
    Output: [[1]]
    Explanation: There is 1 choose 1 = 1 total combination.
      Constraints:
    1 <= n <= 20
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int k = 2;
        List<List<Integer>> expected =
                List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3),
                        List.of(2, 4), List.of(3, 4));
        var result = solution.combine(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int k = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        var result = solution.combine(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
