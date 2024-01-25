package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_achievable_transfer_requests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, requests = [[0,1],[1,0],[0,1],[1,2],[2,0],[3,4]]
    Output: 5
    Explantion: Let's see the requests:
    From building 0 we have employees x and y and both want to move to building 1.
    From building 1 we have employees a and b and they want to move to buildings 2 and 0 respectively.
    From building 2 we have employee z and they want to move to building 0.
    From building 3 we have employee c and they want to move to building 4.
    From building 4 we don't have any requests.
    We can achieve the requests of users x and b by swapping their places.
    We can achieve the requests of users y, a and z by swapping the places in the 3 buildings.
    Example 2:
    Input: n = 3, requests = [[0,0],[1,2],[2,1]]
    Output: 3
    Explantion: Let's see the requests:
    From building 0 we have employee x and they want to stay in the same building 0.
    From building 1 we have employee y and they want to move to building 2.
    From building 2 we have employee z and they want to move to building 1.
    We can achieve all the requests.
    Example 3:
    Input: n = 4, requests = [[0,3],[3,1],[1,2],[2,0]]
    Output: 4
      Constraints:
    1 <= n <= 20
    1 <= requests.length <= 16
    requests[i].length == 2
    0 <= fromi, toi < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] requests = new int[][]{{0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}};
        int expected = 5;
        var result = solution.maximumRequests(n, requests);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] requests = new int[][]{{0, 0}, {1, 2}, {2, 1}};
        int expected = 3;
        var result = solution.maximumRequests(n, requests);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int[][] requests = new int[][]{{0, 3}, {3, 1}, {1, 2}, {2, 0}};
        int expected = 4;
        var result = solution.maximumRequests(n, requests);
        assertThat(result).isEqualTo(expected);
    }

}
