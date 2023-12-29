package com.blogspot.ostas.leetcode.all.medium.time_needed_to_inform_all_employees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, headID = 0, manager = [-1], informTime = [0]
    Output: 0
    Explanation: The head of the company is the only employee in the company.
    Example 2:
    Input: n = 6, headID = 2, manager = [2,2,-1,2,2,2], informTime = [0,0,1,0,0,0]
    Output: 1
    Explanation: The head of the company with id = 2 is the direct manager of all the employees in the company and needs 1 minute to inform them all.
    The tree structure of the employees in the company is shown.
      Constraints:
    1 <= n <= 105
    0 <= headID < n
    manager.length == n
    0 <= manager[i] < n
    manager[headID] == -1
    informTime.length == n
    0 <= informTime[i] <= 1000
    informTime[i] == 0 if employee i has no subordinates.
    It is guaranteed that all the employees can be informed.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int headID = 0;
        int[] manager = new int[]{-1};
        int[] informTime = new int[]{0};
        int expected = 0;
        var result = solution.numOfMinutes(n, headID, manager, informTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int headID = 2;
        int[] manager = new int[]{2, 2, -1, 2, 2, 2};
        int[] informTime = new int[]{0, 0, 1, 0, 0, 0};
        int expected = 1;
        var result = solution.numOfMinutes(n, headID, manager, informTime);
        assertThat(result).isEqualTo(expected);
    }

}
