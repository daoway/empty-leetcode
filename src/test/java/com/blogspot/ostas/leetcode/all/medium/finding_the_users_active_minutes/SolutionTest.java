package com.blogspot.ostas.leetcode.all.medium.finding_the_users_active_minutes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
    Output: [0,2,0,0,0]
    Explanation:
    The user with ID=0 performed actions at minutes 5, 2, and 5 again. Hence, they have a UAM of 2 (minute 5 is only counted once).
    The user with ID=1 performed actions at minutes 2 and 3. Hence, they have a UAM of 2.
    Since both users have a UAM of 2, answer[2] is 2, and the remaining answer[j] values are 0.
    Example 2:
    Input: logs = [[1,1],[2,2],[2,3]], k = 4
    Output: [1,1,0,0]
    Explanation:
    The user with ID=1 performed a single action at minute 1. Hence, they have a UAM of 1.
    The user with ID=2 performed actions at minutes 2 and 3. Hence, they have a UAM of 2.
    There is one user with a UAM of 1 and one with a UAM of 2.
    Hence, answer[1] = 1, answer[2] = 1, and the remaining values are 0.
      Constraints:
    1 <= logs.length <= 104
    0 <= IDi <= 109
    1 <= timei <= 105
    k is in the range [The maximum UAM for a user, 105].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] logs = new int[][]{{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}};
        int k = 5;
        int[] expected = new int[]{0, 2, 0, 0, 0};
        var result = solution.findingUsersActiveMinutes(logs, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] logs = new int[][]{{1, 1}, {2, 2}, {2, 3}};
        int k = 4;
        int[] expected = new int[]{1, 1, 0, 0};
        var result = solution.findingUsersActiveMinutes(logs, k);
        assertThat(result).isEqualTo(expected);
    }

}
