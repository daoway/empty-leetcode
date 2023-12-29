package com.blogspot.ostas.leetcode.all.medium.super_ugly_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 12, primes = [2,7,13,19]
    Output: 32
    Explanation: [1,2,4,7,8,13,14,16,19,26,28,32] is the sequence of the first 12 super ugly numbers given primes = [2,7,13,19].
    Example 2:
    Input: n = 1, primes = [2,3,5]
    Output: 1
    Explanation: 1 has no prime factors, therefore all of its prime factors are in the array primes = [2,3,5].
      Constraints:
    1 <= n <= 105
    1 <= primes.length <= 100
    2 <= primes[i] <= 1000
    primes[i] is guaranteed to be a prime number.
    All the values of primes are unique and sorted in ascending order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 12;
        int[] primes = new int[]{2, 7, 13, 19};
        int expected = 32;
        var result = solution.nthSuperUglyNumber(n, primes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int[] primes = new int[]{2, 3, 5};
        int expected = 1;
        var result = solution.nthSuperUglyNumber(n, primes);
        assertThat(result).isEqualTo(expected);
    }

}
