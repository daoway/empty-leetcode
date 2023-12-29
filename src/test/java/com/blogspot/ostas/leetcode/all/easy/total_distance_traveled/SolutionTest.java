package com.blogspot.ostas.leetcode.all.easy.total_distance_traveled;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mainTank = 5, additionalTank = 10
    Output: 60
    Explanation:
    After spending 5 litre of fuel, fuel remaining is (5 - 5 + 1) = 1 litre and distance traveled is 50km.
    After spending another 1 litre of fuel, no fuel gets injected in the main tank and the main tank becomes empty.
    Total distance traveled is 60km.
    Example 2:
    Input: mainTank = 1, additionalTank = 2
    Output: 10
    Explanation:
    After spending 1 litre of fuel, the main tank becomes empty.
    Total distance traveled is 10km.
      Constraints:
    1 <= mainTank, additionalTank <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int mainTank = 5;
        int additionalTank = 10;
        int expected = 60;
        var result = solution.distanceTraveled(mainTank, additionalTank);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int mainTank = 1;
        int additionalTank = 2;
        int expected = 10;
        var result = solution.distanceTraveled(mainTank, additionalTank);
        assertThat(result).isEqualTo(expected);
    }

}
