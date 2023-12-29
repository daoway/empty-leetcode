package com.blogspot.ostas.leetcode.all.medium.powerful_integers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 2, y = 3, bound = 10
    Output: [2,3,4,5,7,9,10]
    Explanation:
    2 = 20 + 30
    3 = 21 + 30
    4 = 20 + 31
    5 = 21 + 31
    7 = 22 + 31
    9 = 23 + 30
    10 = 20 + 32
    Example 2:
    Input: x = 3, y = 5, bound = 15
    Output: [2,4,6,8,10,14]
      Constraints:
    1 <= x, y <= 100
    0 <= bound <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 2;
        int y = 3;
        int bound = 10;
        List<Integer> expected = List.of(2, 3, 4, 5, 7, 9, 10);
        var result = solution.powerfulIntegers(x, y, bound);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = 3;
        int y = 5;
        int bound = 15;
        List<Integer> expected = List.of(2, 4, 6, 8, 10, 14);
        var result = solution.powerfulIntegers(x, y, bound);
        assertThat(result).isEqualTo(expected);
    }

}
