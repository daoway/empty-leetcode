package com.blogspot.ostas.leetcode.all.easy.minimum_cost_of_buying_candies_with_discount;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cost = [1,2,3]
    Output: 5
    Explanation: We buy the candies with costs 2 and 3, and take the candy with cost 1 for free.
    The total cost of buying all candies is 2 + 3 = 5. This is the only way we can buy the candies.
    Note that we cannot buy candies with costs 1 and 3, and then take the candy with cost 2 for free.
    The cost of the free candy has to be less than or equal to the minimum cost of the purchased candies.
    Example 2:
    Input: cost = [6,5,7,9,2,2]
    Output: 23
    Explanation: The way in which we can get the minimum cost is described below:
    - Buy candies with costs 9 and 7
    - Take the candy with cost 6 for free
    - We buy candies with costs 5 and 2
    - Take the last remaining candy with cost 2 for free
    Hence, the minimum cost to buy all candies is 9 + 7 + 5 + 2 = 23.
    Example 3:
    Input: cost = [5,5]
    Output: 10
    Explanation: Since there are only 2 candies, we buy both of them. There is not a third candy we can take for free.
    Hence, the minimum cost to buy all candies is 5 + 5 = 10.
      Constraints:
    1 <= cost.length <= 100
    1 <= cost[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cost = new int[]{1, 2, 3};
        int expected = 5;
        var result = solution.minimumCost(cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cost = new int[]{6, 5, 7, 9, 2, 2};
        int expected = 23;
        var result = solution.minimumCost(cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] cost = new int[]{5, 5};
        int expected = 10;
        var result = solution.minimumCost(cost);
        assertThat(result).isEqualTo(expected);
    }

}
