package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_make_the_integer_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num1 = 3, num2 = -2
    Output: 3
    Explanation: We can make 3 equal to 0 with the following operations:
    - We choose i = 2 and substract 22 + (-2) from 3, 3 - (4 + (-2)) = 1.
    - We choose i = 2 and substract 22 + (-2) from 1, 1 - (4 + (-2)) = -1.
    - We choose i = 0 and substract 20 + (-2) from -1, (-1) - (1 + (-2)) = 0.
    It can be proven, that 3 is the minimum number of operations that we need to perform.
    Example 2:
    Input: num1 = 5, num2 = 7
    Output: -1
    Explanation: It can be proven, that it is impossible to make 5 equal to 0 with the given operation.
      Constraints:
    1 <= num1 <= 109
    -109 <= num2 <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num1 = 3;
        int num2 = -2;
        int expected = 3;
        var result = solution.makeTheIntegerZero(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num1 = 5;
        int num2 = 7;
        int expected = -1;
        var result = solution.makeTheIntegerZero(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

}
