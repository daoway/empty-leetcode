package com.blogspot.ostas.leetcode.all.medium.corporate_flight_bookings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
    Output: [10,55,45,25,25]
    Explanation:
    Flight labels:        1   2   3   4   5
    Booking 1 reserved:  10  10
    Booking 2 reserved:      20  20
    Booking 3 reserved:      25  25  25  25
    Total seats:         10  55  45  25  25
    Hence, answer = [10,55,45,25,25]
    Example 2:
    Input: bookings = [[1,2,10],[2,2,15]], n = 2
    Output: [10,25]
    Explanation:
    Flight labels:        1   2
    Booking 1 reserved:  10  10
    Booking 2 reserved:      15
    Total seats:         10  25
    Hence, answer = [10,25]
      Constraints:
    1 <= n <= 2 * 104
    1 <= bookings.length <= 2 * 104
    bookings[i].length == 3
    1 <= firsti <= lasti <= n
    1 <= seatsi <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] bookings = new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        int[] expected = new int[]{10, 55, 45, 25, 25};
        var result = solution.corpFlightBookings(bookings, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] bookings = new int[][]{{1, 2, 10}, {2, 2, 15}};
        int n = 2;
        int[] expected = new int[]{10, 25};
        var result = solution.corpFlightBookings(bookings, n);
        assertThat(result).isEqualTo(expected);
    }

}
