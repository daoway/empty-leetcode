package com.blogspot.ostas.leetcode.all.medium.eliminate_maximum_number_of_monsters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: dist = [1,3,4], speed = [1,1,1]
    Output: 3
    Explanation:
    In the beginning, the distances of the monsters are [1,3,4]. You eliminate the first monster.
    After a minute, the distances of the monsters are [X,2,3]. You eliminate the second monster.
    After a minute, the distances of the monsters are [X,X,2]. You eliminate the third monster.
    All 3 monsters can be eliminated.
    Example 2:
    Input: dist = [1,1,2,3], speed = [1,1,1,1]
    Output: 1
    Explanation:
    In the beginning, the distances of the monsters are [1,1,2,3]. You eliminate the first monster.
    After a minute, the distances of the monsters are [X,0,1,2], so you lose.
    You can only eliminate 1 monster.
    Example 3:
    Input: dist = [3,2,4], speed = [5,3,2]
    Output: 1
    Explanation:
    In the beginning, the distances of the monsters are [3,2,4]. You eliminate the first monster.
    After a minute, the distances of the monsters are [X,0,2], so you lose.
    You can only eliminate 1 monster.
      Constraints:
    n == dist.length == speed.length
    1 <= n <= 105
    1 <= dist[i], speed[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] dist = new int[]{1, 3, 4};
        int[] speed = new int[]{1, 1, 1};
        int expected = 3;
        var result = solution.eliminateMaximum(dist, speed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] dist = new int[]{1, 1, 2, 3};
        int[] speed = new int[]{1, 1, 1, 1};
        int expected = 1;
        var result = solution.eliminateMaximum(dist, speed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] dist = new int[]{3, 2, 4};
        int[] speed = new int[]{5, 3, 2};
        int expected = 1;
        var result = solution.eliminateMaximum(dist, speed);
        assertThat(result).isEqualTo(expected);
    }

}
