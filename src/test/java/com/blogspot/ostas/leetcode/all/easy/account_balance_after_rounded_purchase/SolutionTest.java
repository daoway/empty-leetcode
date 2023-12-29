package com.blogspot.ostas.leetcode.all.easy.account_balance_after_rounded_purchase;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: purchaseAmount = 9
    Output: 90
    Explanation: In this example, the nearest multiple of 10 to 9 is 10. Hence, your account balance becomes 100 - 10 = 90.
    Example 2:
    Input: purchaseAmount = 15
    Output: 80
    Explanation: In this example, there are two nearest multiples of 10 to 15: 10 and 20. So, the larger multiple, 20, is chosen.
    Hence, your account balance becomes 100 - 20 = 80.
      Constraints:
    0 <= purchaseAmount <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int purchaseAmount = 9;
        int expected = 90;
        var result = solution.accountBalanceAfterPurchase(purchaseAmount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int purchaseAmount = 15;
        int expected = 80;
        var result = solution.accountBalanceAfterPurchase(purchaseAmount);
        assertThat(result).isEqualTo(expected);
    }

}
