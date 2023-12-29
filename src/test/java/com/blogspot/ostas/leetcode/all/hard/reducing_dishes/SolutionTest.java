package com.blogspot.ostas.leetcode.all.hard.reducing_dishes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: satisfaction = [-1,-8,0,5,-9]
    Output: 14
    Explanation: After Removing the second and last dish, the maximum total like-time coefficient will be equal to (-1*1 + 0*2 + 5*3 = 14).
    Each dish is prepared in one unit of time.
    Example 2:
    Input: satisfaction = [4,3,2]
    Output: 20
    Explanation: Dishes can be prepared in any order, (2*1 + 3*2 + 4*3 = 20)
    Example 3:
    Input: satisfaction = [-1,-4,-5]
    Output: 0
    Explanation: People do not like the dishes. No dish is prepared.
      Constraints:
    n == satisfaction.length
    1 <= n <= 500
    -1000 <= satisfaction[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] satisfaction = new int[]{-1, -8, 0, 5, -9};
        int expected = 14;
        var result = solution.maxSatisfaction(satisfaction);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] satisfaction = new int[]{4, 3, 2};
        int expected = 20;
        var result = solution.maxSatisfaction(satisfaction);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] satisfaction = new int[]{-1, -4, -5};
        int expected = 0;
        var result = solution.maxSatisfaction(satisfaction);
        assertThat(result).isEqualTo(expected);
    }

}
