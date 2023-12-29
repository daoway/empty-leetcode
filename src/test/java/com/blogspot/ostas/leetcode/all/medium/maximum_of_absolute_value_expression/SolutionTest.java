package com.blogspot.ostas.leetcode.all.medium.maximum_of_absolute_value_expression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
    Output: 13
    Example 2:
    Input: arr1 = [1,-2,-5,0,10], arr2 = [0,-2,-1,-7,-4]
    Output: 20
      Constraints:
    2 <= arr1.length == arr2.length <= 40000
    -10^6 <= arr1[i], arr2[i] <= 10^6
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{-1, 4, 5, 6};
        int expected = 13;
        var result = solution.maxAbsValExpr(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr1 = new int[]{1, -2, -5, 0, 10};
        int[] arr2 = new int[]{0, -2, -1, -7, -4};
        int expected = 20;
        var result = solution.maxAbsValExpr(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

}
