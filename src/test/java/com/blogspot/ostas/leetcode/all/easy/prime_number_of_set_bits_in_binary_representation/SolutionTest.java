package com.blogspot.ostas.leetcode.all.easy.prime_number_of_set_bits_in_binary_representation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: left = 6, right = 10
    Output: 4
    Explanation:
    6  -> 110 (2 set bits, 2 is prime)
    7  -> 111 (3 set bits, 3 is prime)
    8  -> 1000 (1 set bit, 1 is not prime)
    9  -> 1001 (2 set bits, 2 is prime)
    10 -> 1010 (2 set bits, 2 is prime)
    4 numbers have a prime number of set bits.
    Example 2:
    Input: left = 10, right = 15
    Output: 5
    Explanation:
    10 -> 1010 (2 set bits, 2 is prime)
    11 -> 1011 (3 set bits, 3 is prime)
    12 -> 1100 (2 set bits, 2 is prime)
    13 -> 1101 (3 set bits, 3 is prime)
    14 -> 1110 (3 set bits, 3 is prime)
    15 -> 1111 (4 set bits, 4 is not prime)
    5 numbers have a prime number of set bits.
      Constraints:
    1 <= left <= right <= 106
    0 <= right - left <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int left = 6;
        int right = 10;
        int expected = 4;
        var result = solution.countPrimeSetBits(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int left = 10;
        int right = 15;
        int expected = 5;
        var result = solution.countPrimeSetBits(left, right);
        assertThat(result).isEqualTo(expected);
    }

}
