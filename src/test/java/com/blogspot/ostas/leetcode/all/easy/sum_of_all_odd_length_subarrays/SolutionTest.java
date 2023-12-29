package com.blogspot.ostas.leetcode.all.easy.sum_of_all_odd_length_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,4,2,5,3]
    Output: 58
    Explanation: The odd-length subarrays of arr and their sums are:
    [1] = 1
    [4] = 4
    [2] = 2
    [5] = 5
    [3] = 3
    [1,4,2] = 7
    [4,2,5] = 11
    [2,5,3] = 10
    [1,4,2,5,3] = 15
    If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
    Example 2:
    Input: arr = [1,2]
    Output: 3
    Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
    Example 3:
    Input: arr = [10,11,12]
    Output: 66
      Constraints:
    1 <= arr.length <= 100
    1 <= arr[i] <= 1000
      Follow up:
    Could you solve this problem in O(n) time complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 4, 2, 5, 3};
        int expected = 58;
        var result = solution.sumOddLengthSubarrays(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2};
        int expected = 3;
        var result = solution.sumOddLengthSubarrays(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{10, 11, 12};
        int expected = 66;
        var result = solution.sumOddLengthSubarrays(arr);
        assertThat(result).isEqualTo(expected);
    }

}
