package com.blogspot.ostas.leetcode.all.hard.minimum_money_required_before_transactions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: transactions = [[2,1],[5,0],[4,2]]
    Output: 10
    Explanation:
    Starting with money = 10, the transactions can be performed in any order.
    It can be shown that starting with money < 10 will fail to complete all transactions in some order.
    Example 2:
    Input: transactions = [[3,0],[0,3]]
    Output: 3
    Explanation:
    - If transactions are in the order [[3,0],[0,3]], the minimum money required to complete the transactions is 3.
    - If transactions are in the order [[0,3],[3,0]], the minimum money required to complete the transactions is 0.
    Thus, starting with money = 3, the transactions can be performed in any order.
      Constraints:
    1 <= transactions.length <= 105
    transactions[i].length == 2
    0 <= costi, cashbacki <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] transactions = new int[][]{{2, 1}, {5, 0}, {4, 2}};
        long expected = 10;
        var result = solution.minimumMoney(transactions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] transactions = new int[][]{{3, 0}, {0, 3}};
        long expected = 3;
        var result = solution.minimumMoney(transactions);
        assertThat(result).isEqualTo(expected);
    }

}
