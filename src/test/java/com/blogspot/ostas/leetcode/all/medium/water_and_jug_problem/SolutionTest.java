package com.blogspot.ostas.leetcode.all.medium.water_and_jug_problem;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: jug1Capacity = 3, jug2Capacity = 5, targetCapacity = 4
    Output: true
    Explanation: The famous Die Hard example
    Example 2:
    Input: jug1Capacity = 2, jug2Capacity = 6, targetCapacity = 5
    Output: false
    Example 3:
    Input: jug1Capacity = 1, jug2Capacity = 2, targetCapacity = 3
    Output: true
      Constraints:
    1 <= jug1Capacity, jug2Capacity, targetCapacity <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int jug1Capacity = 3;
        int jug2Capacity = 5;
        int targetCapacity = 4;
        boolean expected = true;
        var result = solution.canMeasureWater(jug1Capacity, jug2Capacity, targetCapacity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int jug1Capacity = 2;
        int jug2Capacity = 6;
        int targetCapacity = 5;
        boolean expected = false;
        var result = solution.canMeasureWater(jug1Capacity, jug2Capacity, targetCapacity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int jug1Capacity = 1;
        int jug2Capacity = 2;
        int targetCapacity = 3;
        boolean expected = true;
        var result = solution.canMeasureWater(jug1Capacity, jug2Capacity, targetCapacity);
        assertThat(result).isEqualTo(expected);
    }

}
