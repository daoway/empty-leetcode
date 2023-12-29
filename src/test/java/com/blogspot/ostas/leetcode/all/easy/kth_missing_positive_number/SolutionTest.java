package com.blogspot.ostas.leetcode.all.easy.kth_missing_positive_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,3,4,7,11], k = 5
    Output: 9
    Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
    Example 2:
    Input: arr = [1,2,3,4], k = 2
    Output: 6
    Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
      Constraints:
    1 <= arr.length <= 1000
    1 <= arr[i] <= 1000
    1 <= k <= 1000
    arr[i] < arr[j] for 1 <= i < j <= arr.length
      Follow up:
    Could you solve this problem in less than O(n) complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 3, 4, 7, 11};
        int k = 5;
        int expected = 9;
        var result = solution.findKthPositive(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4};
        int k = 2;
        int expected = 6;
        var result = solution.findKthPositive(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
