package com.blogspot.ostas.leetcode.all.hard.maximum_employees_to_be_invited_to_a_meeting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: favorite = [2,2,1,2]
    Output: 3
    Explanation:
    The above figure shows how the company can invite employees 0, 1, and 2, and seat them at the round table.
    All employees cannot be invited because employee 2 cannot sit beside employees 0, 1, and 3, simultaneously.
    Note that the company can also invite employees 1, 2, and 3, and give them their desired seats.
    The maximum number of employees that can be invited to the meeting is 3.
    Example 2:
    Input: favorite = [1,2,0]
    Output: 3
    Explanation:
    Each employee is the favorite person of at least one other employee, and the only way the company can invite them is if they invite every employee.
    The seating arrangement will be the same as that in the figure given in example 1:
    - Employee 0 will sit between employees 2 and 1.
    - Employee 1 will sit between employees 0 and 2.
    - Employee 2 will sit between employees 1 and 0.
    The maximum number of employees that can be invited to the meeting is 3.
    Example 3:
    Input: favorite = [3,0,1,4,1]
    Output: 4
    Explanation:
    The above figure shows how the company will invite employees 0, 1, 3, and 4, and seat them at the round table.
    Employee 2 cannot be invited because the two spots next to their favorite employee 1 are taken.
    So the company leaves them out of the meeting.
    The maximum number of employees that can be invited to the meeting is 4.
      Constraints:
    n == favorite.length
    2 <= n <= 105
    0 <= favorite[i] <= n - 1
    favorite[i] != i
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] favorite = new int[]{2, 2, 1, 2};
        int expected = 3;
        var result = solution.maximumInvitations(favorite);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] favorite = new int[]{1, 2, 0};
        int expected = 3;
        var result = solution.maximumInvitations(favorite);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] favorite = new int[]{3, 0, 1, 4, 1};
        int expected = 4;
        var result = solution.maximumInvitations(favorite);
        assertThat(result).isEqualTo(expected);
    }

}
