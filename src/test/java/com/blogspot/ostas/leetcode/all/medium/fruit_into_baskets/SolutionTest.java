package com.blogspot.ostas.leetcode.all.medium.fruit_into_baskets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: fruits = [1,2,1]
    Output: 3
    Explanation: We can pick from all 3 trees.
    Example 2:
    Input: fruits = [0,1,2,2]
    Output: 3
    Explanation: We can pick from trees [1,2,2].
    If we had started at the first tree, we would only pick from trees [0,1].
    Example 3:
    Input: fruits = [1,2,3,2,2]
    Output: 4
    Explanation: We can pick from trees [2,3,2,2].
    If we had started at the first tree, we would only pick from trees [1,2].
      Constraints:
    1 <= fruits.length <= 105
    0 <= fruits[i] < fruits.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] fruits = new int[]{1, 2, 1};
        int expected = 3;
        var result = solution.totalFruit(fruits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] fruits = new int[]{0, 1, 2, 2};
        int expected = 3;
        var result = solution.totalFruit(fruits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] fruits = new int[]{1, 2, 3, 2, 2};
        int expected = 4;
        var result = solution.totalFruit(fruits);
        assertThat(result).isEqualTo(expected);
    }

}
