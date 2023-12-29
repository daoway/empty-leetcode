package com.blogspot.ostas.leetcode.all.medium.car_pooling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: trips = [[2,1,5],[3,3,7]], capacity = 4
    Output: false
    Example 2:
    Input: trips = [[2,1,5],[3,3,7]], capacity = 5
    Output: true
      Constraints:
    1 <= trips.length <= 1000
    trips[i].length == 3
    1 <= numPassengersi <= 100
    0 <= fromi < toi <= 1000
    1 <= capacity <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        boolean expected = false;
        var result = solution.carPooling(trips, capacity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        boolean expected = true;
        var result = solution.carPooling(trips, capacity);
        assertThat(result).isEqualTo(expected);
    }

}
