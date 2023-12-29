package com.blogspot.ostas.leetcode.all.medium.magnetic_force_between_two_balls;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: position = [1,2,3,4,7], m = 3
    Output: 3
    Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
    Example 2:
    Input: position = [5,4,3,2,1,1000000000], m = 2
    Output: 999999999
    Explanation: We can use baskets 1 and 1000000000.
      Constraints:
    n == position.length
    2 <= n <= 105
    1 <= position[i] <= 109
    All integers in position are distinct.
    2 <= m <= position.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] position = new int[]{1, 2, 3, 4, 7};
        int m = 3;
        int expected = 3;
        var result = solution.maxDistance(position, m);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] position = new int[]{5, 4, 3, 2, 1, 1000000000};
        int m = 2;
        int expected = 999999999;
        var result = solution.maxDistance(position, m);
        assertThat(result).isEqualTo(expected);
    }

}
