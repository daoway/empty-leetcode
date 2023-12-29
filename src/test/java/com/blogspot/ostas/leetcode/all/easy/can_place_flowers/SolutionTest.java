package com.blogspot.ostas.leetcode.all.easy.can_place_flowers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: flowerbed = [1,0,0,0,1], n = 1
    Output: true
    Example 2:
    Input: flowerbed = [1,0,0,0,1], n = 2
    Output: false
      Constraints:
    1 <= flowerbed.length <= 2 * 104
    flowerbed[i] is 0 or 1.
    There are no two adjacent flowers in flowerbed.
    0 <= n <= flowerbed.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        int n = 1;
        boolean expected = true;
        var result = solution.canPlaceFlowers(flowerbed, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        int n = 2;
        boolean expected = false;
        var result = solution.canPlaceFlowers(flowerbed, n);
        assertThat(result).isEqualTo(expected);
    }

}
