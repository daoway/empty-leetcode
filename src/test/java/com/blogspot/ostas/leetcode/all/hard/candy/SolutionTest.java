package com.blogspot.ostas.leetcode.all.hard.candy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ratings = [1,0,2]
    Output: 5
    Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
    Example 2:
    Input: ratings = [1,2,2]
    Output: 4
    Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
    The third child gets 1 candy because it satisfies the above two conditions.
      Constraints:
    n == ratings.length
    1 <= n <= 2 * 104
    0 <= ratings[i] <= 2 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] ratings = new int[]{1, 0, 2};
        int expected = 5;
        var result = solution.candy(ratings);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] ratings = new int[]{1, 2, 2};
        int expected = 4;
        var result = solution.candy(ratings);
        assertThat(result).isEqualTo(expected);
    }

}
