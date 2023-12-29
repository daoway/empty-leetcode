package com.blogspot.ostas.leetcode.all.medium.minimum_domino_rotations_for_equal_row;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tops = [2,1,2,4,2,2], bottoms = [5,2,6,2,3,2]
    Output: 2
    Explanation:
    The first figure represents the dominoes as given by tops and bottoms: before we do any rotations.
    If we rotate the second and fourth dominoes, we can make every value in the top row equal to 2, as indicated by the second figure.
    Example 2:
    Input: tops = [3,5,1,2,3], bottoms = [3,6,3,3,4]
    Output: -1
    Explanation:
    In this case, it is not possible to rotate the dominoes to make one row of values equal.
      Constraints:
    2 <= tops.length <= 2 * 104
    bottoms.length == tops.length
    1 <= tops[i], bottoms[i] <= 6
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] tops = new int[]{2, 1, 2, 4, 2, 2};
        int[] bottoms = new int[]{5, 2, 6, 2, 3, 2};
        int expected = 2;
        var result = solution.minDominoRotations(tops, bottoms);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] tops = new int[]{3, 5, 1, 2, 3};
        int[] bottoms = new int[]{3, 6, 3, 3, 4};
        int expected = -1;
        var result = solution.minDominoRotations(tops, bottoms);
        assertThat(result).isEqualTo(expected);
    }

}
