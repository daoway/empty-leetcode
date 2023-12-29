package com.blogspot.ostas.leetcode.all.hard.minimum_space_wasted_from_packaging;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: packages = [2,3,5], boxes = [[4,8],[2,8]]
    Output: 6
    Explanation: It is optimal to choose the first supplier, using two size-4 boxes and one size-8 box.
    The total waste is (4-2) + (4-3) + (8-5) = 6.
    Example 2:
    Input: packages = [2,3,5], boxes = [[1,4],[2,3],[3,4]]
    Output: -1
    Explanation: There is no box that the package of size 5 can fit in.
    Example 3:
    Input: packages = [3,5,8,10,11,12], boxes = [[12],[11,9],[10,5,14]]
    Output: 9
    Explanation: It is optimal to choose the third supplier, using two size-5 boxes, two size-10 boxes, and two size-14 boxes.
    The total waste is (5-3) + (5-5) + (10-8) + (10-10) + (14-11) + (14-12) = 9.
      Constraints:
    n == packages.length
    m == boxes.length
    1 <= n <= 105
    1 <= m <= 105
    1 <= packages[i] <= 105
    1 <= boxes[j].length <= 105
    1 <= boxes[j][k] <= 105
    sum(boxes[j].length) <= 105
    The elements in boxes[j] are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] packages = new int[]{2, 3, 5};
        int[][] boxes = new int[][]{{4, 8}, {2, 8}};
        int expected = 6;
        var result = solution.minWastedSpace(packages, boxes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] packages = new int[]{2, 3, 5};
        int[][] boxes = new int[][]{{1, 4}, {2, 3}, {3, 4}};
        int expected = -1;
        var result = solution.minWastedSpace(packages, boxes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] packages = new int[]{3, 5, 8, 10, 11, 12};
        int[][] boxes = new int[][]{{12}, {11, 9}, {10, 5, 14}};
        int expected = 9;
        var result = solution.minWastedSpace(packages, boxes);
        assertThat(result).isEqualTo(expected);
    }

}
