package com.blogspot.ostas.leetcode.all.medium.the_latest_time_to_catch_a_bus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: buses = [10,20], passengers = [2,17,18,19], capacity = 2
    Output: 16
    Explanation: Suppose you arrive at time 16.
    At time 10, the first bus departs with the 0th passenger.
    At time 20, the second bus departs with you and the 1st passenger.
    Note that you may not arrive at the same time as another passenger, which is why you must arrive before the 1st passenger to catch the bus.
    Example 2:
    Input: buses = [20,30,10], passengers = [19,13,26,4,25,11,21], capacity = 2
    Output: 20
    Explanation: Suppose you arrive at time 20.
    At time 10, the first bus departs with the 3rd passenger.
    At time 20, the second bus departs with the 5th and 1st passengers.
    At time 30, the third bus departs with the 0th passenger and you.
    Notice if you had arrived any later, then the 6th passenger would have taken your seat on the third bus.
      Constraints:
    n == buses.length
    m == passengers.length
    1 <= n, m, capacity <= 105
    2 <= buses[i], passengers[i] <= 109
    Each element in buses is unique.
    Each element in passengers is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] buses = new int[]{10, 20};
        int[] passengers = new int[]{2, 17, 18, 19};
        int capacity = 2;
        int expected = 16;
        var result = solution.latestTimeCatchTheBus(buses, passengers, capacity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] buses = new int[]{20, 30, 10};
        int[] passengers = new int[]{19, 13, 26, 4, 25, 11, 21};
        int capacity = 2;
        int expected = 20;
        var result = solution.latestTimeCatchTheBus(buses, passengers, capacity);
        assertThat(result).isEqualTo(expected);
    }

}
