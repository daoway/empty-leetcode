package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_coins_for_fruits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [3,1,2]
    Output: 4
    Explanation: You can acquire the fruits as follows:
    - Purchase the 1st fruit with 3 coins, you are allowed to take the 2nd fruit for free.
    - Purchase the 2nd fruit with 1 coin, you are allowed to take the 3rd fruit for free.
    - Take the 3rd fruit for free.
    Note that even though you were allowed to take the 2nd fruit for free, you purchased it because it is more optimal.
    It can be proven that 4 is the minimum number of coins needed to acquire all the fruits.
    Example 2:
    Input: prices = [1,10,1,1]
    Output: 2
    Explanation: You can acquire the fruits as follows:
    - Purchase the 1st fruit with 1 coin, you are allowed to take the 2nd fruit for free.
    - Take the 2nd fruit for free.
    - Purchase the 3rd fruit for 1 coin, you are allowed to take the 4th fruit for free.
    - Take the 4th fruit for free.
    It can be proven that 2 is the minimum number of coins needed to acquire all the fruits.
      Constraints:
    1 <= prices.length <= 1000
    1 <= prices[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{3, 1, 2};
        int expected = 4;
        var result = solution.minimumCoins(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{1, 10, 1, 1};
        int expected = 2;
        var result = solution.minimumCoins(prices);
        assertThat(result).isEqualTo(expected);
    }

}
