package com.blogspot.ostas.leetcode.all.medium.minimize_the_maximum_of_two_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: divisor1 = 2, divisor2 = 7, uniqueCnt1 = 1, uniqueCnt2 = 3
    Output: 4
    Explanation:
    We can distribute the first 4 natural numbers into arr1 and arr2.
    arr1 = [1] and arr2 = [2,3,4].
    We can see that both arrays satisfy all the conditions.
    Since the maximum value is 4, we return it.
    Example 2:
    Input: divisor1 = 3, divisor2 = 5, uniqueCnt1 = 2, uniqueCnt2 = 1
    Output: 3
    Explanation:
    Here arr1 = [1,2], and arr2 = [3] satisfy all conditions.
    Since the maximum value is 3, we return it.
    Example 3:
    Input: divisor1 = 2, divisor2 = 4, uniqueCnt1 = 8, uniqueCnt2 = 2
    Output: 15
    Explanation:
    Here, the final possible arrays can be arr1 = [1,3,5,7,9,11,13,15], and arr2 = [2,6].
    It can be shown that it is not possible to obtain a lower maximum satisfying all conditions.
      Constraints:
    2 <= divisor1, divisor2 <= 105
    1 <= uniqueCnt1, uniqueCnt2 < 109
    2 <= uniqueCnt1 + uniqueCnt2 <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int divisor1 = 2;
        int divisor2 = 7;
        int uniqueCnt1 = 1;
        int uniqueCnt2 = 3;
        int expected = 4;
        var result = solution.minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int divisor1 = 3;
        int divisor2 = 5;
        int uniqueCnt1 = 2;
        int uniqueCnt2 = 1;
        int expected = 3;
        var result = solution.minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int divisor1 = 2;
        int divisor2 = 4;
        int uniqueCnt1 = 8;
        int uniqueCnt2 = 2;
        int expected = 15;
        var result = solution.minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2);
        assertThat(result).isEqualTo(expected);
    }

}
