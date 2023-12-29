package com.blogspot.ostas.leetcode.all.medium.k_th_smallest_prime_fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,5], k = 3
    Output: [2,5]
    Explanation: The fractions to be considered in sorted order are:
    1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
    The third fraction is 2/5.
    Example 2:
    Input: arr = [1,7], k = 1
    Output: [1,7]
      Constraints:
    2 <= arr.length <= 1000
    1 <= arr[i] <= 3 * 104
    arr[0] == 1
    arr[i] is a prime number for i > 0.
    All the numbers of arr are unique and sorted in strictly increasing order.
    1 <= k <= arr.length * (arr.length - 1) / 2
      Follow up: Can you solve the problem with better than O(n2) complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 5};
        int k = 3;
        int[] expected = new int[]{2, 5};
        var result = solution.kthSmallestPrimeFraction(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 7};
        int k = 1;
        int[] expected = new int[]{1, 7};
        var result = solution.kthSmallestPrimeFraction(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
