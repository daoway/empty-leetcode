package com.blogspot.ostas.leetcode.all.easy.most_visited_sector_in_a_circular_track;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, rounds = [1,3,1,2]
    Output: [1,2]
    Explanation: The marathon starts at sector 1. The order of the visited sectors is as follows:
    1 --> 2 --> 3 (end of round 1) --> 4 --> 1 (end of round 2) --> 2 (end of round 3 and the marathon)
    We can see that both sectors 1 and 2 are visited twice and they are the most visited sectors. Sectors 3 and 4 are visited only once.
    Example 2:
    Input: n = 2, rounds = [2,1,2,1,2,1,2,1,2]
    Output: [2]
    Example 3:
    Input: n = 7, rounds = [1,3,5,7]
    Output: [1,2,3,4,5,6,7]
      Constraints:
    2 <= n <= 100
    1 <= m <= 100
    rounds.length == m + 1
    1 <= rounds[i] <= n
    rounds[i] != rounds[i + 1] for 0 <= i < m
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[] rounds = new int[]{1, 3, 1, 2};
        List<Integer> expected = List.of(1, 2);
        var result = solution.mostVisited(n, rounds);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[] rounds = new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2};
        List<Integer> expected = List.of(2);
        var result = solution.mostVisited(n, rounds);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 7;
        int[] rounds = new int[]{1, 3, 5, 7};
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7);
        var result = solution.mostVisited(n, rounds);
        assertThat(result).isEqualTo(expected);
    }

}
