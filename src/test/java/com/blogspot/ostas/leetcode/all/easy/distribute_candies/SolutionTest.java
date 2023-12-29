package com.blogspot.ostas.leetcode.all.easy.distribute_candies;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: candyType = [1,1,2,2,3,3]
    Output: 3
    Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
    Example 2:
    Input: candyType = [1,1,2,3]
    Output: 2
    Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.
    Example 3:
    Input: candyType = [6,6,6,6]
    Output: 1
    Explanation: Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.
      Constraints:
    n == candyType.length
    2 <= n <= 104
    n is even.
    -105 <= candyType[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] candyType = new int[]{1, 1, 2, 2, 3, 3};
        int expected = 3;
        var result = solution.distributeCandies(candyType);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] candyType = new int[]{1, 1, 2, 3};
        int expected = 2;
        var result = solution.distributeCandies(candyType);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] candyType = new int[]{6, 6, 6, 6};
        int expected = 1;
        var result = solution.distributeCandies(candyType);
        assertThat(result).isEqualTo(expected);
    }

}
