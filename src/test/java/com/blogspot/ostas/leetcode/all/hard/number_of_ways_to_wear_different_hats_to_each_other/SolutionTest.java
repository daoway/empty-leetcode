package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_wear_different_hats_to_each_other;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: hats = [[3,4],[4,5],[5]]
    Output: 1
    Explanation: There is only one way to choose hats given the conditions.
    First person choose hat 3, Second person choose hat 4 and last one hat 5.
    Example 2:
    Input: hats = [[3,5,1],[3,5]]
    Output: 4
    Explanation: There are 4 ways to choose hats:
    (3,5), (5,3), (1,3) and (1,5)
    Example 3:
    Input: hats = [[1,2,3,4],[1,2,3,4],[1,2,3,4],[1,2,3,4]]
    Output: 24
    Explanation: Each person can choose hats labeled from 1 to 4.
    Number of Permutations of (1,2,3,4) = 24.
      Constraints:
    n == hats.length
    1 <= n <= 10
    1 <= hats[i].length <= 40
    1 <= hats[i][j] <= 40
    hats[i] contains a list of unique integers.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> hats = List.of(List.of(3, 4), List.of(4, 5), List.of(5));
        int expected = 1;
        var result = solution.numberWays(hats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> hats = List.of(List.of(3, 5, 1), List.of(3, 5));
        int expected = 4;
        var result = solution.numberWays(hats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<Integer>> hats =
                List.of(List.of(1, 2, 3, 4), List.of(1, 2, 3, 4), List.of(1, 2, 3, 4),
                        List.of(1, 2, 3, 4));
        int expected = 24;
        var result = solution.numberWays(hats);
        assertThat(result).isEqualTo(expected);
    }

}
