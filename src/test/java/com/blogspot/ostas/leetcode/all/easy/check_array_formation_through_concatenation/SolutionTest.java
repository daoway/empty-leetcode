package com.blogspot.ostas.leetcode.all.easy.check_array_formation_through_concatenation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [15,88], pieces = [[88],[15]]
    Output: true
    Explanation: Concatenate [15] then [88]
    Example 2:
    Input: arr = [49,18,16], pieces = [[16,18,49]]
    Output: false
    Explanation: Even though the numbers match, we cannot reorder pieces[0].
    Example 3:
    Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
    Output: true
    Explanation: Concatenate [91] then [4,64] then [78]
      Constraints:
    1 <= pieces.length <= arr.length <= 100
    sum(pieces[i].length) == arr.length
    1 <= pieces[i].length <= arr.length
    1 <= arr[i], pieces[i][j] <= 100
    The integers in arr are distinct.
    The integers in pieces are distinct (i.e., If we flatten pieces in a 1D array, all the integers in this array are distinct).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{15, 88};
        int[][] pieces = new int[][]{{88}, {15}};
        boolean expected = true;
        var result = solution.canFormArray(arr, pieces);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{49, 18, 16};
        int[][] pieces = new int[][]{{16, 18, 49}};
        boolean expected = false;
        var result = solution.canFormArray(arr, pieces);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{91, 4, 64, 78};
        int[][] pieces = new int[][]{{78}, {4, 64}, {91}};
        boolean expected = true;
        var result = solution.canFormArray(arr, pieces);
        assertThat(result).isEqualTo(expected);
    }

}
