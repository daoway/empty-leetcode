package com.blogspot.ostas.leetcode.all.easy.rectangle_overlap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
    Output: true
    Example 2:
    Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
    Output: false
    Example 3:
    Input: rec1 = [0,0,1,1], rec2 = [2,2,3,3]
    Output: false
      Constraints:
    rec1.length == 4
    rec2.length == 4
    -109 <= rec1[i], rec2[i] <= 109
    rec1 and rec2 represent a valid rectangle with a non-zero area.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rec1 = new int[]{0, 0, 2, 2};
        int[] rec2 = new int[]{1, 1, 3, 3};
        boolean expected = true;
        var result = solution.isRectangleOverlap(rec1, rec2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rec1 = new int[]{0, 0, 1, 1};
        int[] rec2 = new int[]{1, 0, 2, 1};
        boolean expected = false;
        var result = solution.isRectangleOverlap(rec1, rec2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] rec1 = new int[]{0, 0, 1, 1};
        int[] rec2 = new int[]{2, 2, 3, 3};
        boolean expected = false;
        var result = solution.isRectangleOverlap(rec1, rec2);
        assertThat(result).isEqualTo(expected);
    }

}
