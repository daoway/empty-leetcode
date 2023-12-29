package com.blogspot.ostas.leetcode.all.medium.find_k_closest_elements;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,4,5], k = 4, x = 3
    Output: [1,2,3,4]
    Example 2:
    Input: arr = [1,2,3,4,5], k = 4, x = -1
    Output: [1,2,3,4]
      Constraints:
    1 <= k <= arr.length
    1 <= arr.length <= 104
    arr is sorted in ascending order.
    -104 <= arr[i], x <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> expected = List.of(1, 2, 3, 4);
        var result = solution.findClosestElements(arr, k, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = -1;
        List<Integer> expected = List.of(1, 2, 3, 4);
        var result = solution.findClosestElements(arr, k, x);
        assertThat(result).isEqualTo(expected);
    }

}
