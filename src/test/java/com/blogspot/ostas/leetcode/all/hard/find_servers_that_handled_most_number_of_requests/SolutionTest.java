package com.blogspot.ostas.leetcode.all.hard.find_servers_that_handled_most_number_of_requests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 3, arrival = [1,2,3,4,5], load = [5,2,3,3,3]
    Output: [1]
    Explanation:
    All of the servers start out available.
    The first 3 requests are handled by the first 3 servers in order.
    Request 3 comes in. Server 0 is busy, so it's assigned to the next available server, which is 1.
    Request 4 comes in. It cannot be handled since all servers are busy, so it is dropped.
    Servers 0 and 2 handled one request each, while server 1 handled two requests. Hence server 1 is the busiest server.
    Example 2:
    Input: k = 3, arrival = [1,2,3,4], load = [1,2,1,2]
    Output: [0]
    Explanation:
    The first 3 requests are handled by first 3 servers.
    Request 3 comes in. It is handled by server 0 since the server is available.
    Server 0 handled two requests, while servers 1 and 2 handled one request each. Hence server 0 is the busiest server.
    Example 3:
    Input: k = 3, arrival = [1,2,3], load = [10,12,11]
    Output: [0,1,2]
    Explanation: Each server handles a single request, so they are all considered the busiest.
      Constraints:
    1 <= k <= 105
    1 <= arrival.length, load.length <= 105
    arrival.length == load.length
    1 <= arrival[i], load[i] <= 109
    arrival is strictly increasing.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 3;
        int[] arrival = new int[]{1, 2, 3, 4, 5};
        int[] load = new int[]{5, 2, 3, 3, 3};
        List<Integer> expected = List.of(1);
        var result = solution.busiestServers(k, arrival, load);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 3;
        int[] arrival = new int[]{1, 2, 3, 4};
        int[] load = new int[]{1, 2, 1, 2};
        List<Integer> expected = List.of(0);
        var result = solution.busiestServers(k, arrival, load);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int k = 3;
        int[] arrival = new int[]{1, 2, 3};
        int[] load = new int[]{10, 12, 11};
        List<Integer> expected = List.of(0, 1, 2);
        var result = solution.busiestServers(k, arrival, load);
        assertThat(result).isEqualTo(expected);
    }

}
