package com.blogspot.ostas.leetcode.all.hard.maximize_number_of_nice_divisors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: primeFactors = 5
    Output: 6
    Explanation: 200 is a valid value of n.
    It has 5 prime factors: [2,2,2,5,5], and it has 6 nice divisors: [10,20,40,50,100,200].
    There is not other value of n that has at most 5 prime factors and more nice divisors.
    Example 2:
    Input: primeFactors = 8
    Output: 18
      Constraints:
    1 <= primeFactors <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int primeFactors = 5;
        int expected = 6;
        var result = solution.maxNiceDivisors(primeFactors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int primeFactors = 8;
        int expected = 18;
        var result = solution.maxNiceDivisors(primeFactors);
        assertThat(result).isEqualTo(expected);
    }

}
