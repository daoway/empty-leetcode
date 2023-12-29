package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_coins_to_be_added;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: coins = [1,4,10], target = 19
    Output: 2
    Explanation: We need to add coins 2 and 8. The resulting array will be [1,2,4,8,10].
    It can be shown that all integers from 1 to 19 are obtainable from the resulting array, and that 2 is the minimum number of coins that need to be added to the array.
    Example 2:
    Input: coins = [1,4,10,5,7,19], target = 19
    Output: 1
    Explanation: We only need to add the coin 2. The resulting array will be [1,2,4,5,7,10,19].
    It can be shown that all integers from 1 to 19 are obtainable from the resulting array, and that 1 is the minimum number of coins that need to be added to the array.
    Example 3:
    Input: coins = [1,1,1], target = 20
    Output: 3
    Explanation: We need to add coins 4, 8, and 16. The resulting array will be [1,1,1,4,8,16].
    It can be shown that all integers from 1 to 20 are obtainable from the resulting array, and that 3 is the minimum number of coins that need to be added to the array.
      Constraints:
    1 <= target <= 105
    1 <= coins.length <= 105
    1 <= coins[i] <= target
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] coins = new int[]{1, 4, 10};
        int target = 19;
        int expected = 2;
        var result = solution.minimumAddedCoins(coins, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] coins = new int[]{1, 4, 10, 5, 7, 19};
        int target = 19;
        int expected = 1;
        var result = solution.minimumAddedCoins(coins, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] coins = new int[]{1, 1, 1};
        int target = 20;
        int expected = 3;
        var result = solution.minimumAddedCoins(coins, target);
        assertThat(result).isEqualTo(expected);
    }

}
