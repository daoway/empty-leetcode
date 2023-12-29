package com.blogspot.ostas.leetcode.all.hard.make_array_strictly_increasing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
    Output: 1
    Explanation: Replace 5 with 2, then arr1 = [1, 2, 3, 6, 7].
    Example 2:
    Input: arr1 = [1,5,3,6,7], arr2 = [4,3,1]
    Output: 2
    Explanation: Replace 5 with 3 and then replace 3 with 4. arr1 = [1, 3, 4, 6, 7].
    Example 3:
    Input: arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
    Output: -1
    Explanation: You can't make arr1 strictly increasing.
      Constraints:
    1 <= arr1.length, arr2.length <= 2000
    0 <= arr1[i], arr2[i] <= 10^9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr1 = new int[]{1, 5, 3, 6, 7};
        int[] arr2 = new int[]{1, 3, 2, 4};
        int expected = 1;
        var result = solution.makeArrayIncreasing(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr1 = new int[]{1, 5, 3, 6, 7};
        int[] arr2 = new int[]{4, 3, 1};
        int expected = 2;
        var result = solution.makeArrayIncreasing(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr1 = new int[]{1, 5, 3, 6, 7};
        int[] arr2 = new int[]{1, 6, 3, 3};
        int expected = -1;
        var result = solution.makeArrayIncreasing(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

}
