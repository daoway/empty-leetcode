package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_alloys;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 2, budget = 15, composition = [[1,1,1],[1,1,10]], stock = [0,0,0], cost = [1,2,3]
    Output: 2
    Explanation: It is optimal to use the 1st machine to create alloys.
    To create 2 alloys we need to buy the:
    - 2 units of metal of the 1st type.
    - 2 units of metal of the 2nd type.
    - 2 units of metal of the 3rd type.
    In total, we need 2 * 1 + 2 * 2 + 2 * 3 = 12 coins, which is smaller than or equal to budget = 15.
    Notice that we have 0 units of metal of each type and we have to buy all the required units of metal.
    It can be proven that we can create at most 2 alloys.
    Example 2:
    Input: n = 3, k = 2, budget = 15, composition = [[1,1,1],[1,1,10]], stock = [0,0,100], cost = [1,2,3]
    Output: 5
    Explanation: It is optimal to use the 2nd machine to create alloys.
    To create 5 alloys we need to buy:
    - 5 units of metal of the 1st type.
    - 5 units of metal of the 2nd type.
    - 0 units of metal of the 3rd type.
    In total, we need 5 * 1 + 5 * 2 + 0 * 3 = 15 coins, which is smaller than or equal to budget = 15.
    It can be proven that we can create at most 5 alloys.
    Example 3:
    Input: n = 2, k = 3, budget = 10, composition = [[2,1],[1,2],[1,1]], stock = [1,1], cost = [5,5]
    Output: 2
    Explanation: It is optimal to use the 3rd machine to create alloys.
    To create 2 alloys we need to buy the:
    - 1 unit of metal of the 1st type.
    - 1 unit of metal of the 2nd type.
    In total, we need 1 * 5 + 1 * 5 = 10 coins, which is smaller than or equal to budget = 10.
    It can be proven that we can create at most 2 alloys.
      Constraints:
    1 <= n, k <= 100
    0 <= budget <= 108
    composition.length == k
    composition[i].length == n
    1 <= composition[i][j] <= 100
    stock.length == cost.length == n
    0 <= stock[i] <= 108
    1 <= cost[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 2;
        int budget = 15;
        List<List<Integer>> composition = List.of(List.of(1, 1, 1), List.of(1, 1, 10));
        List<Integer> stock = List.of(0, 0, 0);
        List<Integer> cost = List.of(1, 2, 3);
        int expected = 2;
        var result = solution.maxNumberOfAlloys(n, k, budget, composition, stock, cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int k = 2;
        int budget = 15;
        List<List<Integer>> composition = List.of(List.of(1, 1, 1), List.of(1, 1, 10));
        List<Integer> stock = List.of(0, 0, 100);
        List<Integer> cost = List.of(1, 2, 3);
        int expected = 5;
        var result = solution.maxNumberOfAlloys(n, k, budget, composition, stock, cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int k = 3;
        int budget = 10;
        List<List<Integer>> composition = List.of(List.of(2, 1), List.of(1, 2), List.of(1, 1));
        List<Integer> stock = List.of(1, 1);
        List<Integer> cost = List.of(5, 5);
        int expected = 2;
        var result = solution.maxNumberOfAlloys(n, k, budget, composition, stock, cost);
        assertThat(result).isEqualTo(expected);
    }

}
