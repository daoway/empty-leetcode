package com.blogspot.ostas.leetcode.all.medium.count_pairs_of_points_with_distance_k;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: coordinates = [[1,2],[4,2],[1,3],[5,2]], k = 5
    Output: 2
    Explanation: We can choose the following pairs:
    - (0,1): Because we have (1 XOR 4) + (2 XOR 2) = 5.
    - (2,3): Because we have (1 XOR 5) + (3 XOR 2) = 5.
    Example 2:
    Input: coordinates = [[1,3],[1,3],[1,3],[1,3],[1,3]], k = 0
    Output: 10
    Explanation: Any two chosen pairs will have a distance of 0. There are 10 ways to choose two pairs.
      Constraints:
    2 <= coordinates.length <= 50000
    0 <= xi, yi <= 106
    0 <= k <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> coordinates =
                List.of(List.of(1, 2), List.of(4, 2), List.of(1, 3), List.of(5, 2));
        int k = 5;
        int expected = 2;
        var result = solution.countPairs(coordinates, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> coordinates =
                List.of(List.of(1, 3), List.of(1, 3), List.of(1, 3), List.of(1, 3),
                        List.of(1, 3));
        int k = 0;
        int expected = 10;
        var result = solution.countPairs(coordinates, k);
        assertThat(result).isEqualTo(expected);
    }

}
