package com.blogspot.ostas.leetcode.all.medium.maximum_earnings_from_taxi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, rides = [[2,5,4],[1,5,1]]
    Output: 7
    Explanation: We can pick up passenger 0 to earn 5 - 2 + 4 = 7 dollars.
    Example 2:
    Input: n = 20, rides = [[1,6,1],[3,10,2],[10,12,3],[11,12,2],[12,15,2],[13,18,1]]
    Output: 20
    Explanation: We will pick up the following passengers:
    - Drive passenger 1 from point 3 to point 10 for a profit of 10 - 3 + 2 = 9 dollars.
    - Drive passenger 2 from point 10 to point 12 for a profit of 12 - 10 + 3 = 5 dollars.
    - Drive passenger 5 from point 13 to point 18 for a profit of 18 - 13 + 1 = 6 dollars.
    We earn 9 + 5 + 6 = 20 dollars in total.
      Constraints:
    1 <= n <= 105
    1 <= rides.length <= 3 * 104
    rides[i].length == 3
    1 <= starti < endi <= n
    1 <= tipi <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] rides = new int[][]{{2, 5, 4}, {1, 5, 1}};
        long expected = 7;
        var result = solution.maxTaxiEarnings(n, rides);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 20;
        int[][] rides = new int[][]{{1, 6, 1}, {3, 10, 2}, {10, 12, 3}, {11, 12, 2}, {12, 15, 2},
                {13, 18, 1}};
        long expected = 20;
        var result = solution.maxTaxiEarnings(n, rides);
        assertThat(result).isEqualTo(expected);
    }

}
