package com.blogspot.ostas.leetcode.all.hard.count_all_possible_routes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: locations = [2,3,6,8,4], start = 1, finish = 3, fuel = 5
    Output: 4
    Explanation: The following are all possible routes, each uses 5 units of fuel:
    1 -> 3
    1 -> 2 -> 3
    1 -> 4 -> 3
    1 -> 4 -> 2 -> 3
    Example 2:
    Input: locations = [4,3,1], start = 1, finish = 0, fuel = 6
    Output: 5
    Explanation: The following are all possible routes:
    1 -> 0, used fuel = 1
    1 -> 2 -> 0, used fuel = 5
    1 -> 2 -> 1 -> 0, used fuel = 5
    1 -> 0 -> 1 -> 0, used fuel = 3
    1 -> 0 -> 1 -> 0 -> 1 -> 0, used fuel = 5
    Example 3:
    Input: locations = [5,2,1], start = 0, finish = 2, fuel = 3
    Output: 0
    Explanation: It is impossible to get from 0 to 2 using only 3 units of fuel since the shortest route needs 4 units of fuel.
      Constraints:
    2 <= locations.length <= 100
    1 <= locations[i] <= 109
    All integers in locations are distinct.
    0 <= start, finish < locations.length
    1 <= fuel <= 200
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] locations = new int[]{2, 3, 6, 8, 4};
        int start = 1;
        int finish = 3;
        int fuel = 5;
        int expected = 4;
        var result = solution.countRoutes(locations, start, finish, fuel);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] locations = new int[]{4, 3, 1};
        int start = 1;
        int finish = 0;
        int fuel = 6;
        int expected = 5;
        var result = solution.countRoutes(locations, start, finish, fuel);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] locations = new int[]{5, 2, 1};
        int start = 0;
        int finish = 2;
        int fuel = 3;
        int expected = 0;
        var result = solution.countRoutes(locations, start, finish, fuel);
        assertThat(result).isEqualTo(expected);
    }

}
