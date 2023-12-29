package com.blogspot.ostas.leetcode.all.hard.maximum_value_of_k_coins_from_piles;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: piles = [[1,100,3],[7,8,9]], k = 2
    Output: 101
    Explanation:
    The above diagram shows the different ways we can choose k coins.
    The maximum total we can obtain is 101.
    Example 2:
    Input: piles = [[100],[100],[100],[100],[100],[100],[1,1,1,1,1,1,700]], k = 7
    Output: 706
    Explanation:
    The maximum total can be obtained if we choose all coins from the last pile.
      Constraints:
    n == piles.length
    1 <= n <= 1000
    1 <= piles[i][j] <= 105
    1 <= k <= sum(piles[i].length) <= 2000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> piles = List.of(List.of(1, 100, 3), List.of(7, 8, 9));
        int k = 2;
        int expected = 101;
        var result = solution.maxValueOfCoins(piles, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> piles =
                List.of(List.of(100), List.of(100), List.of(100), List.of(100), List.of(100),
                        List.of(100), List.of(1, 1, 1, 1, 1, 1, 700));
        int k = 7;
        int expected = 706;
        var result = solution.maxValueOfCoins(piles, k);
        assertThat(result).isEqualTo(expected);
    }

}
