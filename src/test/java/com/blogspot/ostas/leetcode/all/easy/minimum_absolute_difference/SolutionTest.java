package com.blogspot.ostas.leetcode.all.easy.minimum_absolute_difference;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [4,2,1,3]
    Output: [[1,2],[2,3],[3,4]]
    Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
    Example 2:
    Input: arr = [1,3,6,10,15]
    Output: [[1,3]]
    Example 3:
    Input: arr = [3,8,-10,23,19,-4,-14,27]
    Output: [[-14,-10],[19,23],[23,27]]
      Constraints:
    2 <= arr.length <= 105
    -106 <= arr[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{4, 2, 1, 3};
        List<List<Integer>> expected = List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4));
        var result = solution.minimumAbsDifference(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 3, 6, 10, 15};
        List<List<Integer>> expected = List.of(List.of(1, 3));
        var result = solution.minimumAbsDifference(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> expected = List.of(List.of(-14, -10), List.of(19, 23), List.of(23, 27));
        var result = solution.minimumAbsDifference(arr);
        assertThat(result).isEqualTo(expected);
    }

}
