package com.blogspot.ostas.leetcode.all.medium.car_fleet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
    Output: 3
    Explanation:
    The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12.
    The car starting at 0 does not catch up to any other car, so it is a fleet by itself.
    The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.
    Note that no other cars meet these fleets before the destination, so the answer is 3.
    Example 2:
    Input: target = 10, position = [3], speed = [3]
    Output: 1
    Explanation: There is only one car, hence there is only one fleet.
    Example 3:
    Input: target = 100, position = [0,2,4], speed = [4,2,1]
    Output: 1
    Explanation:
    The cars starting at 0 (speed 4) and 2 (speed 2) become a fleet, meeting each other at 4. The fleet moves at speed 2.
    Then, the fleet (speed 2) and the car starting at 4 (speed 1) become one fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.
      Constraints:
    n == position.length == speed.length
    1 <= n <= 105
    0 < target <= 106
    0 <= position[i] < target
    All the values of position are unique.
    0 < speed[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 12;
        int[] position = new int[]{10, 8, 0, 5, 3};
        int[] speed = new int[]{2, 4, 1, 1, 3};
        int expected = 3;
        var result = solution.carFleet(target, position, speed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 10;
        int[] position = new int[]{3};
        int[] speed = new int[]{3};
        int expected = 1;
        var result = solution.carFleet(target, position, speed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int target = 100;
        int[] position = new int[]{0, 2, 4};
        int[] speed = new int[]{4, 2, 1};
        int expected = 1;
        var result = solution.carFleet(target, position, speed);
        assertThat(result).isEqualTo(expected);
    }

}
