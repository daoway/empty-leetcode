package com.blogspot.ostas.leetcode.all.easy.rank_transform_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [40,10,20,30]
    Output: [4,1,2,3]
    Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
    Example 2:
    Input: arr = [100,100,100]
    Output: [1,1,1]
    Explanation: Same elements share the same rank.
    Example 3:
    Input: arr = [37,12,28,9,100,56,80,5,12]
    Output: [5,3,4,2,8,6,7,1,3]
      Constraints:
    0 <= arr.length <= 105
    -109 <= arr[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{40, 10, 20, 30};
        int[] expected = new int[]{4, 1, 2, 3};
        var result = solution.arrayRankTransform(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{100, 100, 100};
        int[] expected = new int[]{1, 1, 1};
        var result = solution.arrayRankTransform(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] expected = new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3};
        var result = solution.arrayRankTransform(arr);
        assertThat(result).isEqualTo(expected);
    }

}
