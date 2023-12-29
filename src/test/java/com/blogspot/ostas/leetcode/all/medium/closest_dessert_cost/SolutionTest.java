package com.blogspot.ostas.leetcode.all.medium.closest_dessert_cost;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: baseCosts = [1,7], toppingCosts = [3,4], target = 10
    Output: 10
    Explanation: Consider the following combination (all 0-indexed):
    - Choose base 1: cost 7
    - Take 1 of topping 0: cost 1 x 3 = 3
    - Take 0 of topping 1: cost 0 x 4 = 0
    Total: 7 + 3 + 0 = 10.
    Example 2:
    Input: baseCosts = [2,3], toppingCosts = [4,5,100], target = 18
    Output: 17
    Explanation: Consider the following combination (all 0-indexed):
    - Choose base 1: cost 3
    - Take 1 of topping 0: cost 1 x 4 = 4
    - Take 2 of topping 1: cost 2 x 5 = 10
    - Take 0 of topping 2: cost 0 x 100 = 0
    Total: 3 + 4 + 10 + 0 = 17. You cannot make a dessert with a total cost of 18.
    Example 3:
    Input: baseCosts = [3,10], toppingCosts = [2,5], target = 9
    Output: 8
    Explanation: It is possible to make desserts with cost 8 and 10. Return 8 as it is the lower cost.
      Constraints:
    n == baseCosts.length
    m == toppingCosts.length
    1 <= n, m <= 10
    1 <= baseCosts[i], toppingCosts[i] <= 104
    1 <= target <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] baseCosts = new int[]{1, 7};
        int[] toppingCosts = new int[]{3, 4};
        int target = 10;
        int expected = 10;
        var result = solution.closestCost(baseCosts, toppingCosts, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] baseCosts = new int[]{2, 3};
        int[] toppingCosts = new int[]{4, 5, 100};
        int target = 18;
        int expected = 17;
        var result = solution.closestCost(baseCosts, toppingCosts, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] baseCosts = new int[]{3, 10};
        int[] toppingCosts = new int[]{2, 5};
        int target = 9;
        int expected = 8;
        var result = solution.closestCost(baseCosts, toppingCosts, target);
        assertThat(result).isEqualTo(expected);
    }

}
