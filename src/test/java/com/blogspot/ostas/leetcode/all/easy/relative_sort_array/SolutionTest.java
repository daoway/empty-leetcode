package com.blogspot.ostas.leetcode.all.easy.relative_sort_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
    Output: [2,2,2,1,4,3,3,9,6,7,19]
    Example 2:
    Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
    Output: [22,28,8,6,17,44]
      Constraints:
    1 <= arr1.length, arr2.length <= 1000
    0 <= arr1[i], arr2[i] <= 1000
    All the elements of arr2 are distinct.
    Each arr2[i] is in arr1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};
        int[] expected = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        var result = solution.relativeSortArray(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr1 = new int[]{28, 6, 22, 8, 44, 17};
        int[] arr2 = new int[]{22, 28, 8, 6};
        int[] expected = new int[]{22, 28, 8, 6, 17, 44};
        var result = solution.relativeSortArray(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

}
