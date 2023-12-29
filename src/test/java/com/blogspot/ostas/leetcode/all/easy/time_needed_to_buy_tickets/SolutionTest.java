package com.blogspot.ostas.leetcode.all.easy.time_needed_to_buy_tickets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tickets = [2,3,2], k = 2
    Output: 6
    Explanation:
    - In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
    - In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
    The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
    Example 2:
    Input: tickets = [5,1,1,1], k = 0
    Output: 8
    Explanation:
    - In the first pass, everyone in the line buys a ticket and the line becomes [4, 0, 0, 0].
    - In the next 4 passes, only the person in position 0 is buying tickets.
    The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.
      Constraints:
    n == tickets.length
    1 <= n <= 100
    1 <= tickets[i] <= 100
    0 <= k < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] tickets = new int[]{2, 3, 2};
        int k = 2;
        int expected = 6;
        var result = solution.timeRequiredToBuy(tickets, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] tickets = new int[]{5, 1, 1, 1};
        int k = 0;
        int expected = 8;
        var result = solution.timeRequiredToBuy(tickets, k);
        assertThat(result).isEqualTo(expected);
    }

}
