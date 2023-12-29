package com.blogspot.ostas.leetcode.all.medium.the_time_when_the_network_becomes_idle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[0,1],[1,2]], patience = [0,2,1]
    Output: 8
    Explanation:
    At (the beginning of) second 0,
    - Data server 1 sends its message (denoted 1A) to the master server.
    - Data server 2 sends its message (denoted 2A) to the master server.

    At second 1,
    - Message 1A arrives at the master server. Master server processes message 1A instantly and sends a reply 1A back.
    - Server 1 has not received any reply. 1 second (1 < patience[1] = 2) elapsed since this server has sent the message, therefore it does not resend the message.
    - Server 2 has not received any reply. 1 second (1 == patience[2] = 1) elapsed since this server has sent the message, therefore it resends the message (denoted 2B).

    At second 2,
    - The reply 1A arrives at server 1. No more resending will occur from server 1.
    - Message 2A arrives at the master server. Master server processes message 2A instantly and sends a reply 2A back.
    - Server 2 resends the message (denoted 2C).
    ...
    At second 4,
    - The reply 2A arrives at server 2. No more resending will occur from server 2.
    ...
    At second 7, reply 2D arrives at server 2.

    Starting from the beginning of the second 8, there are no messages passing between servers or arriving at servers.
    This is the time when the network becomes idle.
    Example 2:
    Input: edges = [[0,1],[0,2],[1,2]], patience = [0,10,10]
    Output: 3
    Explanation: Data servers 1 and 2 receive a reply back at the beginning of second 2.
    From the beginning of the second 3, the network becomes idle.
      Constraints:
    n == patience.length
    2 <= n <= 105
    patience[0] == 0
    1 <= patience[i] <= 105 for 1 <= i < n
    1 <= edges.length <= min(105, n * (n - 1) / 2)
    edges[i].length == 2
    0 <= ui, vi < n
    ui != vi
    There are no duplicate edges.
    Each server can directly or indirectly reach another server.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {1, 2}};
        int[] patience = new int[]{0, 2, 1};
        int expected = 8;
        var result = solution.networkBecomesIdle(edges, patience);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 2}};
        int[] patience = new int[]{0, 10, 10};
        int expected = 3;
        var result = solution.networkBecomesIdle(edges, patience);
        assertThat(result).isEqualTo(expected);
    }

}
