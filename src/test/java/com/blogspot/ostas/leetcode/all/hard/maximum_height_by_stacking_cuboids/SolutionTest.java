package com.blogspot.ostas.leetcode.all.hard.maximum_height_by_stacking_cuboids;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cuboids = [[50,45,20],[95,37,53],[45,23,12]]
    Output: 190
    Explanation:
    Cuboid 1 is placed on the bottom with the 53x37 side facing down with height 95.
    Cuboid 0 is placed next with the 45x20 side facing down with height 50.
    Cuboid 2 is placed next with the 23x12 side facing down with height 45.
    The total height is 95 + 50 + 45 = 190.
    Example 2:
    Input: cuboids = [[38,25,45],[76,35,3]]
    Output: 76
    Explanation:
    You can't place any of the cuboids on the other.
    We choose cuboid 1 and rotate it so that the 35x3 side is facing down and its height is 76.
    Example 3:
    Input: cuboids = [[7,11,17],[7,17,11],[11,7,17],[11,17,7],[17,7,11],[17,11,7]]
    Output: 102
    Explanation:
    After rearranging the cuboids, you can see that all cuboids have the same dimension.
    You can place the 11x7 side down on all cuboids so their heights are 17.
    The maximum height of stacked cuboids is 6 * 17 = 102.
      Constraints:
    n == cuboids.length
    1 <= n <= 100
    1 <= widthi, lengthi, heighti <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] cuboids = new int[][]{{50, 45, 20}, {95, 37, 53}, {45, 23, 12}};
        int expected = 190;
        var result = solution.maxHeight(cuboids);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] cuboids = new int[][]{{38, 25, 45}, {76, 35, 3}};
        int expected = 76;
        var result = solution.maxHeight(cuboids);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] cuboids = new int[][]{{7, 11, 17}, {7, 17, 11}, {11, 7, 17}, {11, 17, 7}, {17, 7, 11},
                {17, 11, 7}};
        int expected = 102;
        var result = solution.maxHeight(cuboids);
        assertThat(result).isEqualTo(expected);
    }

}
