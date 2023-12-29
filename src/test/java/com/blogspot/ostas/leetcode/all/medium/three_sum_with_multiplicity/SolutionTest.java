package com.blogspot.ostas.leetcode.all.medium.three_sum_with_multiplicity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
    Output: 20
    Explanation:
    Enumerating by the values (arr[i], arr[j], arr[k]):
    (1, 2, 5) occurs 8 times;
    (1, 3, 4) occurs 8 times;
    (2, 2, 4) occurs 2 times;
    (2, 3, 3) occurs 2 times.
    Example 2:
    Input: arr = [1,1,2,2,2,2], target = 5
    Output: 12
    Explanation:
    arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
    We choose one 1 from [1,1] in 2 ways,
    and two 2s from [2,2,2,2] in 6 ways.
    Example 3:
    Input: arr = [2,1,3], target = 6
    Output: 1
    Explanation: (1, 2, 3) occured one time in the array so we return 1.
      Constraints:
    3 <= arr.length <= 3000
    0 <= arr[i] <= 100
    0 <= target <= 300
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int target = 8;
        int expected = 20;
        var result = solution.threeSumMulti(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 2, 2, 2, 2};
        int target = 5;
        int expected = 12;
        var result = solution.threeSumMulti(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{2, 1, 3};
        int target = 6;
        int expected = 1;
        var result = solution.threeSumMulti(arr, target);
        assertThat(result).isEqualTo(expected);
    }

}
