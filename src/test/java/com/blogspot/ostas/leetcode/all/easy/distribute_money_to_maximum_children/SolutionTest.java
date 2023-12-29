package com.blogspot.ostas.leetcode.all.easy.distribute_money_to_maximum_children;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: money = 20, children = 3
    Output: 1
    Explanation:
    The maximum number of children with 8 dollars will be 1. One of the ways to distribute the money is:
    - 8 dollars to the first child.
    - 9 dollars to the second child.
    - 3 dollars to the third child.
    It can be proven that no distribution exists such that number of children getting 8 dollars is greater than 1.
    Example 2:
    Input: money = 16, children = 2
    Output: 2
    Explanation: Each child can be given 8 dollars.
      Constraints:
    1 <= money <= 200
    2 <= children <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int money = 20;
        int children = 3;
        int expected = 1;
        var result = solution.distMoney(money, children);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int money = 16;
        int children = 2;
        int expected = 2;
        var result = solution.distMoney(money, children);
        assertThat(result).isEqualTo(expected);
    }

}
