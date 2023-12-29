package com.blogspot.ostas.leetcode.all.medium.pancake_sorting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,2,4,1]
    Output: [4,2,4,3]
    Explanation:
    We perform 4 pancake flips, with k values 4, 2, 4, and 3.
    Starting state: arr = [3, 2, 4, 1]
    After 1st flip (k = 4): arr = [1, 4, 2, 3]
    After 2nd flip (k = 2): arr = [4, 1, 2, 3]
    After 3rd flip (k = 4): arr = [3, 2, 1, 4]
    After 4th flip (k = 3): arr = [1, 2, 3, 4], which is sorted.
    Example 2:
    Input: arr = [1,2,3]
    Output: []
    Explanation: The input is already sorted, so there is no need to flip anything.
    Note that other answers, such as [3, 3], would also be accepted.
      Constraints:
    1 <= arr.length <= 100
    1 <= arr[i] <= arr.length
    All integers in arr are unique (i.e. arr is a permutation of the integers from 1 to arr.length).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 2, 4, 1};
        List<Integer> expected = List.of(4, 2, 4, 3);
        var result = solution.pancakeSort(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3};
        List<Integer> expected = List.of();
        var result = solution.pancakeSort(arr);
        assertThat(result).isEqualTo(expected);
    }

}
