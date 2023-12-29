package com.blogspot.ostas.leetcode.all.medium.check_if_array_pairs_are_divisible_by_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
    Output: true
    Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
    Example 2:
    Input: arr = [1,2,3,4,5,6], k = 7
    Output: true
    Explanation: Pairs are (1,6),(2,5) and(3,4).
    Example 3:
    Input: arr = [1,2,3,4,5,6], k = 10
    Output: false
    Explanation: You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10.
      Constraints:
    arr.length == n
    1 <= n <= 105
    n is even.
    -109 <= arr[i] <= 109
    1 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int k = 5;
        boolean expected = true;
        var result = solution.canArrange(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int k = 7;
        boolean expected = true;
        var result = solution.canArrange(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int k = 10;
        boolean expected = false;
        var result = solution.canArrange(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
