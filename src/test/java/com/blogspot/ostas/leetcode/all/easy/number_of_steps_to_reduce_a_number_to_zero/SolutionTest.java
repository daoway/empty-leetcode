package com.blogspot.ostas.leetcode.all.easy.number_of_steps_to_reduce_a_number_to_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 14
    Output: 6
    Explanation:
    Step 1) 14 is even; divide by 2 and obtain 7.
    Step 2) 7 is odd; subtract 1 and obtain 6.
    Step 3) 6 is even; divide by 2 and obtain 3.
    Step 4) 3 is odd; subtract 1 and obtain 2.
    Step 5) 2 is even; divide by 2 and obtain 1.
    Step 6) 1 is odd; subtract 1 and obtain 0.
    Example 2:
    Input: num = 8
    Output: 4
    Explanation:
    Step 1) 8 is even; divide by 2 and obtain 4.
    Step 2) 4 is even; divide by 2 and obtain 2.
    Step 3) 2 is even; divide by 2 and obtain 1.
    Step 4) 1 is odd; subtract 1 and obtain 0.
    Example 3:
    Input: num = 123
    Output: 12
      Constraints:
    0 <= num <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 14;
        int expected = 6;
        var result = solution.numberOfSteps(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 8;
        int expected = 4;
        var result = solution.numberOfSteps(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 123;
        int expected = 12;
        var result = solution.numberOfSteps(num);
        assertThat(result).isEqualTo(expected);
    }

}
