package com.blogspot.ostas.leetcode.all.medium.mice_and_cheese;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: reward1 = [1,1,3,4], reward2 = [4,4,1,1], k = 2
    Output: 15
    Explanation: In this example, the first mouse eats the 2nd (0-indexed) and the 3rd types of cheese, and the second mouse eats the 0th and the 1st types of cheese.
    The total points are 4 + 4 + 3 + 4 = 15.
    It can be proven that 15 is the maximum total points that the mice can achieve.
    Example 2:
    Input: reward1 = [1,1], reward2 = [1,1], k = 2
    Output: 2
    Explanation: In this example, the first mouse eats the 0th (0-indexed) and 1st types of cheese, and the second mouse does not eat any cheese.
    The total points are 1 + 1 = 2.
    It can be proven that 2 is the maximum total points that the mice can achieve.
      Constraints:
    1 <= n == reward1.length == reward2.length <= 105
    1 <= reward1[i], reward2[i] <= 1000
    0 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] reward1 = new int[]{1, 1, 3, 4};
        int[] reward2 = new int[]{4, 4, 1, 1};
        int k = 2;
        int expected = 15;
        var result = solution.miceAndCheese(reward1, reward2, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] reward1 = new int[]{1, 1};
        int[] reward2 = new int[]{1, 1};
        int k = 2;
        int expected = 2;
        var result = solution.miceAndCheese(reward1, reward2, k);
        assertThat(result).isEqualTo(expected);
    }

}
